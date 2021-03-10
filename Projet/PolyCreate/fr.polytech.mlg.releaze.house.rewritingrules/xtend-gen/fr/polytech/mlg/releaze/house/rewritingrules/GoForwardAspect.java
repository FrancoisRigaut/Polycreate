package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.GoForward;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspectGoForwardAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;

@Aspect(className = GoForward.class)
@SuppressWarnings("all")
public class GoForwardAspect extends InstructionAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final GoForward _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspectGoForwardAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspectGoForwardAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.GoForward){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspect._privk3_runIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.GoForward)_self,prog);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "GoForward", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final GoForwardAspectGoForwardAspectProperties _self_, final GoForward _self, final Program prog) {
    PolyCreateAspect.ctrl(prog).goForward();
    final long startTime = System.currentTimeMillis();
    boolean e = PolyCreateAspect.scanEvents(prog);
    while (((System.currentTimeMillis() < (startTime + _self.getTime().get())) && (!e))) {
      e = PolyCreateAspect.scanEvents(prog);
    }
  }
}
