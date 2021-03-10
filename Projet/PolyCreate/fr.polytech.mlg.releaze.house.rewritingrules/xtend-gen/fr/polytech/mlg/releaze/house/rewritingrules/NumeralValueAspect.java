package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.NumeralValue;
import fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspectNumeralValueAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.ValueAspect;

@Aspect(className = NumeralValue.class)
@SuppressWarnings("all")
public class NumeralValueAspect extends ValueAspect {
  @Step
  @ReplaceAspectMethod
  public static int get(final NumeralValue _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspectNumeralValueAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspectNumeralValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int get()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.NumeralValue){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspect._privk3_get(_self_, (fr.polytech.mlg.releaze.house.polycreate.NumeralValue)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "NumeralValue", "get");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (int)result;
  }
  
  protected static int _privk3_get(final NumeralValueAspectNumeralValueAspectProperties _self_, final NumeralValue _self) {
    return _self.getValue();
  }
}
