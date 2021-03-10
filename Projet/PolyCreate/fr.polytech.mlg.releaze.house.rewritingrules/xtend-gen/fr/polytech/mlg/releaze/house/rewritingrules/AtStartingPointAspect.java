package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.EventAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;

@Aspect(className = AtStartingPoint.class)
@SuppressWarnings("all")
public class AtStartingPointAspect extends EventAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean scanIt(final AtStartingPoint _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean scanIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspect._privk3_scanIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint)_self,prog));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "AtStartingPoint", "scanIt");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  public static double margin(final AtStartingPoint _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# double margin()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint){
    	result = fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspect._privk3_margin(_self_, (fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint)_self);
    };
    return (double)result;
  }
  
  public static void margin(final AtStartingPoint _self, final double margin) {
    final fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void margin(double)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint){
    	fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspect._privk3_margin(_self_, (fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint)_self,margin);
    };
  }
  
  protected static boolean _privk3_scanIt(final AtStartingPointAspectAtStartingPointAspectProperties _self_, final AtStartingPoint _self, final Program prog) {
    final double[] sp = PolyCreateAspect.ctrl(prog).startingPoint;
    final double[] pos = PolyCreateAspect.ctrl(prog).getPosition();
    return (((((((pos[0] - AtStartingPointAspect.margin(_self)) <= sp[0]) && (sp[0] <= (pos[0] + AtStartingPointAspect.margin(_self)))) && ((pos[1] - AtStartingPointAspect.margin(_self)) <= sp[1])) && (sp[1] <= (pos[1] + AtStartingPointAspect.margin(_self)))) && ((pos[2] - AtStartingPointAspect.margin(_self)) <= sp[2])) && (sp[2] <= (pos[2] + AtStartingPointAspect.margin(_self))));
  }
  
  protected static double _privk3_margin(final AtStartingPointAspectAtStartingPointAspectProperties _self_, final AtStartingPoint _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMargin") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (double) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.margin;
  }
  
  protected static void _privk3_margin(final AtStartingPointAspectAtStartingPointAspectProperties _self_, final AtStartingPoint _self, final double margin) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMargin")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, margin);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.margin = margin;
    }
  }
}
