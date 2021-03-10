package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.CliffFront;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspectCliffFrontAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.EventAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;

@Aspect(className = CliffFront.class)
@SuppressWarnings("all")
public class CliffFrontAspect extends EventAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean scanIt(final CliffFront _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspectCliffFrontAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspectCliffFrontAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean scanIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.CliffFront){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspect._privk3_scanIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.CliffFront)_self,prog));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "CliffFront", "scanIt");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_scanIt(final CliffFrontAspectCliffFrontAspectProperties _self_, final CliffFront _self, final Program prog) {
    return PolyCreateAspect.ctrl(prog).isThereCliffAtFront();
  }
}
