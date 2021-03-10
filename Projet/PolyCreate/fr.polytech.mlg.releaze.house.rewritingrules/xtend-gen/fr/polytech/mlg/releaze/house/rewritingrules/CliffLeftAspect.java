package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.CliffLeft;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspectCliffLeftAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.EventAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;

@Aspect(className = CliffLeft.class)
@SuppressWarnings("all")
public class CliffLeftAspect extends EventAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean scanIt(final CliffLeft _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspectCliffLeftAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspectCliffLeftAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean scanIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.CliffLeft){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspect._privk3_scanIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.CliffLeft)_self,prog));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "CliffLeft", "scanIt");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_scanIt(final CliffLeftAspectCliffLeftAspectProperties _self_, final CliffLeft _self, final Program prog) {
    return PolyCreateAspect.ctrl(prog).isThereCliffAtLeft();
  }
}
