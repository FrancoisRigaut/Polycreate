package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.Instruction;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspectInstructionAspectProperties;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public abstract class InstructionAspect {
  @Step
  @ReplaceAspectMethod
  @Abstract
  public static void runIt(final Instruction _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspectInstructionAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspectInstructionAspectContext.getSelf(_self);
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect#void runIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.OpenGrip){
    			fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspect.runIt((fr.polytech.mlg.releaze.house.polycreate.OpenGrip)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect#void runIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspect
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect#void runIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.TurnAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Turn){
    			fr.polytech.mlg.releaze.house.rewritingrules.TurnAspect.runIt((fr.polytech.mlg.releaze.house.polycreate.Turn)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect#void runIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.TurnAspect
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect#void runIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.CloseGripAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.CloseGrip){
    			fr.polytech.mlg.releaze.house.rewritingrules.CloseGripAspect.runIt((fr.polytech.mlg.releaze.house.polycreate.CloseGrip)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect#void runIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.CloseGripAspect
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect#void runIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.GoForward){
    			fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspect.runIt((fr.polytech.mlg.releaze.house.polycreate.GoForward)_self,prog);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect#void runIt(Program) from fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspect
    // #DispatchPointCut_before# void runIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Instruction){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect._privk3_runIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.Instruction)_self,prog);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "Instruction", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final Program prog) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
