package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.CliffRight;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspectCliffRightAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.EventAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;

@Aspect(className = CliffRight.class)
@SuppressWarnings("all")
public class CliffRightAspect extends EventAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean scanIt(final CliffRight _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspectCliffRightAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspectCliffRightAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean scanIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.CliffRight){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspect._privk3_scanIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.CliffRight)_self,prog));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "CliffRight", "scanIt");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_scanIt(final CliffRightAspectCliffRightAspectProperties _self_, final CliffRight _self, final Program prog) {
    return PolyCreateAspect.ctrl(prog).isThereCliffAtRight();
  }
}
