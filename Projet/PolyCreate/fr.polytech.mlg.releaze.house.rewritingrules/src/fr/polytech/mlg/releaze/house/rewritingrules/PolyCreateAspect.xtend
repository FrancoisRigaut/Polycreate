package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step

import fr.polytech.mlg.releaze.house.polycreate.Program
import fr.polytech.mlg.releaze.house.polycreate.State
import fr.polytech.mlg.releaze.house.polycreate.Instruction
import fr.polytech.mlg.releaze.house.polycreate.Event
import fr.polytech.mlg.releaze.house.polycreate.GoForward
import fr.polytech.mlg.releaze.house.polycreate.Turn

import static extension fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect.*
import static extension fr.polytech.mlg.releaze.house.rewritingrules.StateAspect.*
import static extension fr.polytech.mlg.releaze.house.rewritingrules.EventAspect.*
import static extension fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect.*
import fr.polytech.mlg.releaze.house.polycreate.Value
import fr.polytech.mlg.releaze.house.polycreate.NumeralValue
import fr.polytech.mlg.releaze.house.polycreate.RandomValue
import java.util.Random
import fr.polytech.mlg.releaze.house.polycreate.OpenGrip
import fr.polytech.mlg.releaze.house.polycreate.CloseGrip
import fr.polytech.mlg.releaze.house.polycreate.BumpRight
import fr.polytech.mlg.releaze.house.polycreate.BumpLeft
import fr.polytech.mlg.releaze.house.polycreate.CliffFront
import fr.polytech.mlg.releaze.house.polycreate.CliffRight
import fr.polytech.mlg.releaze.house.polycreate.CliffLeft
import fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint
import fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable
import fr.polytech.mlg.releaze.house.polycreate.GoTo

@Aspect(className=Program)
class PolyCreateAspect {
	public PolyCreateControler ctrl;
	
	@Main
	def void entryPoint() {
		_self.ctrl = new PolyCreateControler();
		while(true) {
			_self.scanEvents();
			val s = _self.getCurrentState();
			s.runIt(_self);
		}
	}
	
	@ReplaceAspectMethod
	def State getCurrentState() {
		for (State s : _self.states) {
			if (s.name == _self.currentStateName) {
				return s;
			}
		}
		return null;
	}
	
	@ReplaceAspectMethod
	def boolean scanEvents() {
		var i = 0;
		var found = false;
		while (i < _self.events.size() && !found) {
			var e = _self.events.get(i);
			if (e.states.map[name].contains(_self.currentStateName)) {
				if (found = e.scanIt(_self)) {
					while (true) {
						e.runIt(_self);
					}
				}
			}
			i++;
		}
		return found;
	}
}

@Aspect(className=Event)
abstract class EventAspect {
	
	public int currentInstruction = 0;
	
	@Step
	@ReplaceAspectMethod
	def boolean scanIt(Program prog);
	
	@Step
	@ReplaceAspectMethod
	def void runIt(Program prog) {
		prog.ctrl.stop();
		_self.instructions.get(_self.currentInstruction).runIt(prog);
		_self.currentInstruction = (_self.currentInstruction + 1) % _self.instructions.size();
	}
}

@Aspect(className=BumpRight)
class BumpRightAspect extends EventAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean scanIt(Program prog) {
		return prog.ctrl.isThereCollisionAtRight();
	}
}

@Aspect(className=BumpLeft)
class BumpLeftAspect extends EventAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean scanIt(Program prog) {
		return prog.ctrl.isThereCollisionAtLeft();
	}
}

@Aspect(className=CliffFront)
class CliffFrontAspect extends EventAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean scanIt(Program prog) {
		return prog.ctrl.isThereCliffAtFront();
	}
}

@Aspect(className=CliffRight)
class CliffRightAspect extends EventAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean scanIt(Program prog) {
		return prog.ctrl.isThereCliffAtRight();
	}
}

@Aspect(className=CliffLeft)
class CliffLeftAspect extends EventAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean scanIt(Program prog) {
		return prog.ctrl.isThereCliffAtLeft();
	}
}

@Aspect(className=AtStartingPoint)
class AtStartingPointAspect extends EventAspect {
	public double margin = 0.01;
	
	@Step
	@ReplaceAspectMethod
	def boolean scanIt(Program prog) {
		val sp = prog.ctrl.startingPoint;
		val pos = prog.ctrl.getPosition();
		return 	(pos.get(0)-_self.margin) <= sp.get(0) && sp.get(0) <= (pos.get(0)+_self.margin)
			&&	(pos.get(1)-_self.margin) <= sp.get(1) && sp.get(1) <= (pos.get(1)+_self.margin)
			&&	(pos.get(2)-_self.margin) <= sp.get(2) && sp.get(2) <= (pos.get(2)+_self.margin);
	}
}

@Aspect(className=ObjectGrabbable)
class ObjectGrabbableAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean scanIt(Program prog) {
		return prog.ctrl.getObjectDistanceToGripper() < 1500;
	}
}

@Aspect(className=State)
class StateAspect {
	
	public int currentInstruction = 0;
	
	@Step
	@ReplaceAspectMethod
	def void runIt(Program prog) {
		prog.ctrl.stop();
		_self.instructions.get(_self.currentInstruction).runIt(prog);
		if (prog.scanEvents()) {
			_self.currentInstruction = 0;
		} else {
			_self.currentInstruction = (_self.currentInstruction + 1) % _self.instructions.size();
		}		
	}
}

@Aspect(className=Instruction)
abstract class InstructionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(Program prog);
}

@Aspect(className=GoTo)
abstract class GoToAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(Program prog) {
		prog.currentStateName = _self.stateName;
	}
}

@Aspect(className=GoForward)
class GoForwardAspect extends InstructionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(Program prog) {
		prog.ctrl.goForward();
		val startTime = System.currentTimeMillis();
		var e = prog.scanEvents();
		while (System.currentTimeMillis() < startTime + _self.time.get() && !e){
			e = prog.scanEvents();
		}
	}
}

@Aspect(className=Turn)
class TurnAspect extends InstructionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(Program prog) {
		prog.ctrl.turn(_self.angle.get());
	}
}

@Aspect(className=OpenGrip)
class OpenGripAspect extends InstructionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(Program prog) {
		prog.ctrl.openGripper();
	}
}

@Aspect(className=CloseGrip)
class CloseGripAspect extends InstructionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(Program prog) {
		prog.ctrl.closeGripper();
	}
}

@Aspect(className=Value)
abstract class ValueAspect {
	
	@Step
	@ReplaceAspectMethod
	def int get();
}

@Aspect(className=NumeralValue)
class NumeralValueAspect extends ValueAspect {
	
	@Step
	@ReplaceAspectMethod
	def int get() {
		return _self.value;
	}
}

@Aspect(className=RandomValue)
class RandomValueAspect {
	
	@Step
	@ReplaceAspectMethod
	def int get() {
		return new Random().nextInt((_self.upperBound - _self.lowerBound) + 1) + _self.lowerBound;
	}
}