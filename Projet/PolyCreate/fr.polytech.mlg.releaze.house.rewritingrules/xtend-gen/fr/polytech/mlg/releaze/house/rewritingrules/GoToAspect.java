package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.GoTo;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.GoToAspectGoToAspectProperties;

@Aspect(className = GoTo.class)
@SuppressWarnings("all")
public abstract class GoToAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final GoTo _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.GoToAspectGoToAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.GoToAspectGoToAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.GoTo){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.polytech.mlg.releaze.house.rewritingrules.GoToAspect._privk3_runIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.GoTo)_self,prog);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "GoTo", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final GoToAspectGoToAspectProperties _self_, final GoTo _self, final Program prog) {
    prog.setCurrentStateName(_self.getStateName());
  }
}
