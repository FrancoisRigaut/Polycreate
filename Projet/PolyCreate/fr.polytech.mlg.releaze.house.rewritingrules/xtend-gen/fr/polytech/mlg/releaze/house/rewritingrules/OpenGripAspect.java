package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.OpenGrip;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspectOpenGripAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect;

@Aspect(className = OpenGrip.class)
@SuppressWarnings("all")
public class OpenGripAspect extends InstructionAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final OpenGrip _self, final Program prog) {
    final fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspectOpenGripAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspectOpenGripAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(Program)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.OpenGrip){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspect._privk3_runIt(_self_, (fr.polytech.mlg.releaze.house.polycreate.OpenGrip)_self,prog);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {prog}, command, "OpenGrip", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final OpenGripAspectOpenGripAspectProperties _self_, final OpenGrip _self, final Program prog) {
    PolyCreateAspect.ctrl(prog).openGripper();
  }
}
