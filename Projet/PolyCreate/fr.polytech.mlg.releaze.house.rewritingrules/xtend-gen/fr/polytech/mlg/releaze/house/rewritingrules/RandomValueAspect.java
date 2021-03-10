package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.polytech.mlg.releaze.house.polycreate.RandomValue;
import fr.polytech.mlg.releaze.house.rewritingrules.RandomValueAspectRandomValueAspectProperties;
import java.util.Random;

@Aspect(className = RandomValue.class)
@SuppressWarnings("all")
public class RandomValueAspect {
  @Step
  @ReplaceAspectMethod
  public static int get(final RandomValue _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.RandomValueAspectRandomValueAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.RandomValueAspectRandomValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int get()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.RandomValue){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.polytech.mlg.releaze.house.rewritingrules.RandomValueAspect._privk3_get(_self_, (fr.polytech.mlg.releaze.house.polycreate.RandomValue)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "RandomValue", "get");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (int)result;
  }
  
  protected static int _privk3_get(final RandomValueAspectRandomValueAspectProperties _self_, final RandomValue _self) {
    Random _random = new Random();
    int _upperBound = _self.getUpperBound();
    int _lowerBound = _self.getLowerBound();
    int _minus = (_upperBound - _lowerBound);
    int _plus = (_minus + 1);
    int _nextInt = _random.nextInt(_plus);
    int _lowerBound_1 = _self.getLowerBound();
    return (_nextInt + _lowerBound_1);
  }
}
