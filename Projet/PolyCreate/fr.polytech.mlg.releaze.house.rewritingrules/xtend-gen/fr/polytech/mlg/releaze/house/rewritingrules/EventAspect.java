package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.Event;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;

@Aspect(className = Event.class)
@SuppressWarnings("all")
public abstract class EventAspect {
  @Step
  @ReplaceAspectMethod
  @Abstract
  public static boolean scanIt(final Event _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.BumpLeftAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.BumpLeft){
    			result = fr.polytech.mlg.releaze.house.rewritingrules.BumpLeftAspect.scanIt((fr.polytech.mlg.releaze.house.polycreate.BumpLeft)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.BumpLeftAspect
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.CliffLeft){
    			result = fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspect.scanIt((fr.polytech.mlg.releaze.house.polycreate.CliffLeft)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspect
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint){
    			result = fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspect.scanIt((fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspect
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.CliffRight){
    			result = fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspect.scanIt((fr.polytech.mlg.releaze.house.polycreate.CliffRight)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspect
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.CliffFront){
    			result = fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspect.scanIt((fr.polytech.mlg.releaze.house.polycreate.CliffFront)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspect
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.BumpRightAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.BumpRight){
    			result = fr.polytech.mlg.releaze.house.rewritingrules.BumpRightAspect.scanIt((fr.polytech.mlg.releaze.house.polycreate.BumpRight)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.EventAspect#boolean scanIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.BumpRightAspect
    // #DispatchPointCut_before# boolean scanIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Event){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.polytech.mlg.releaze.house.rewritingrules.EventAspect._privk3_scanIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.Event)_self,prog));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "Event", "scanIt");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  @Step
  @ReplaceAspectMethod
  public static void runIt(final Event _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Event){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.polytech.mlg.releaze.house.rewritingrules.EventAspect._privk3_runIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.Event)_self,prog);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "Event", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static int currentInstruction(final Event _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int currentInstruction()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Event){
    	result = fr.polytech.mlg.releaze.house.rewritingrules.EventAspect._privk3_currentInstruction(_self_, (fr.polytech.mlg.releaze.house.polycreate.Event)_self);
    };
    return (int)result;
  }
  
  public static void currentInstruction(final Event _self, final int currentInstruction) {
    final fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentInstruction(int)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Event){
    	fr.polytech.mlg.releaze.house.rewritingrules.EventAspect._privk3_currentInstruction(_self_, (fr.polytech.mlg.releaze.house.polycreate.Event)_self,currentInstruction);
    };
  }
  
  protected static boolean _privk3_scanIt(final EventAspectEventAspectProperties _self_, final Event _self, final Program prog) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_runIt(final EventAspectEventAspectProperties _self_, final Event _self, final Program prog) {
    PolyCreateAspect.ctrl(prog).stop();
    InstructionAspect.runIt(_self.getInstructions().get(EventAspect.currentInstruction(_self)), prog);
    int _currentInstruction = EventAspect.currentInstruction(_self);
    int _plus = (_currentInstruction + 1);
    int _size = _self.getInstructions().size();
    int _modulo = (_plus % _size);
    EventAspect.currentInstruction(_self, _modulo);
  }
  
  protected static int _privk3_currentInstruction(final EventAspectEventAspectProperties _self_, final Event _self) {
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
  
  protected static void _privk3_currentInstruction(final EventAspectEventAspectProperties _self_, final Event _self, final int currentInstruction) {
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
