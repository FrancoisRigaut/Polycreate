package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.Value;
import fr.polytech.mlg.releaze.house.rewritingrules.ValueAspectValueAspectProperties;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public abstract class ValueAspect {
  @Step
  @ReplaceAspectMethod
  @Abstract
  public static int get(final Value _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.ValueAspectValueAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto fr.polytech.mlg.releaze.house.rewritingrules.ValueAspect#int get() from fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspect
    		if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.NumeralValue){
    			result = fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspect.get((fr.polytech.mlg.releaze.house.polycreate.NumeralValue)_self);
    		} else
    		// EndInjectInto fr.polytech.mlg.releaze.house.rewritingrules.ValueAspect#int get() from fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspect
    // #DispatchPointCut_before# int get()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Value){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.polytech.mlg.releaze.house.rewritingrules.ValueAspect._privk3_get(_self_, (fr.polytech.mlg.releaze.house.polycreate.Value)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Value", "get");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (int)result;
  }
  
  protected static int _privk3_get(final ValueAspectValueAspectProperties _self_, final Value _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
