package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.ObjectGrabbableAspectObjectGrabbableAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;

@Aspect(className = ObjectGrabbable.class)
@SuppressWarnings("all")
public class ObjectGrabbableAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean scanIt(final ObjectGrabbable _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.ObjectGrabbableAspectObjectGrabbableAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.ObjectGrabbableAspectObjectGrabbableAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean scanIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.polytech.mlg.releaze.house.rewritingrules.ObjectGrabbableAspect._privk3_scanIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable)_self,prog));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "ObjectGrabbable", "scanIt");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_scanIt(final ObjectGrabbableAspectObjectGrabbableAspectProperties _self_, final ObjectGrabbable _self, final Program prog) {
    double _objectDistanceToGripper = PolyCreateAspect.ctrl(prog).getObjectDistanceToGripper();
    return (_objectDistanceToGripper < 1500);
  }
}
