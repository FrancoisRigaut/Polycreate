package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.polycreate.Turn;
import fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.TurnAspectTurnAspectProperties;

@Aspect(className = Turn.class)
@SuppressWarnings("all")
public class TurnAspect extends InstructionAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final Turn _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.TurnAspectTurnAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.TurnAspectTurnAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Turn){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.polytech.mlg.releaze.house.rewritingrules.TurnAspect._privk3_runIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.Turn)_self,prog);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "Turn", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final TurnAspectTurnAspectProperties _self_, final Turn _self, final Program prog) {
    PolyCreateAspect.ctrl(prog).turn(_self.getAngle().get());
  }
}
