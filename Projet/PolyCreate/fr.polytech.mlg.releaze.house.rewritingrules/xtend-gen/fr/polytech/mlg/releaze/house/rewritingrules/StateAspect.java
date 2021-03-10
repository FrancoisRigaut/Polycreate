package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.polycreate.State;
import fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.StateAspectStateAspectProperties;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final State _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.StateAspectStateAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.StateAspectStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.State){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.polytech.mlg.releaze.house.rewritingrules.StateAspect._privk3_runIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.State)_self,prog);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "State", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static int currentInstruction(final State _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.StateAspectStateAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int currentInstruction()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.State){
    	result = fr.polytech.mlg.releaze.house.rewritingrules.StateAspect._privk3_currentInstruction(_self_, (fr.polytech.mlg.releaze.house.polycreate.State)_self);
    };
    return (int)result;
  }
  
  public static void currentInstruction(final State _self, final int currentInstruction) {
    final fr.polytech.mlg.releaze.house.rewritingrules.StateAspectStateAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.StateAspectStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentInstruction(int)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.State){
    	fr.polytech.mlg.releaze.house.rewritingrules.StateAspect._privk3_currentInstruction(_self_, (fr.polytech.mlg.releaze.house.polycreate.State)_self,currentInstruction);
    };
  }
  
  protected static void _privk3_runIt(final StateAspectStateAspectProperties _self_, final State _self, final Program prog) {
    PolyCreateAspect.ctrl(prog).stop();
    InstructionAspect.runIt(_self.getInstructions().get(StateAspect.currentInstruction(_self)), prog);
    boolean _scanEvents = PolyCreateAspect.scanEvents(prog);
    if (_scanEvents) {
      StateAspect.currentInstruction(_self, 0);
    } else {
      int _currentInstruction = StateAspect.currentInstruction(_self);
      int _plus = (_currentInstruction + 1);
      int _size = _self.getInstructions().size();
      int _modulo = (_plus % _size);
      StateAspect.currentInstruction(_self, _modulo);
    }
  }
  
  protected static int _privk3_currentInstruction(final StateAspectStateAspectProperties _self_, final State _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentInstruction") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentInstruction;
  }
  
  protected static void _privk3_currentInstruction(final StateAspectStateAspectProperties _self_, final State _self, final int currentInstruction) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentInstruction")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentInstruction);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentInstruction = currentInstruction;
    }
  }
}
