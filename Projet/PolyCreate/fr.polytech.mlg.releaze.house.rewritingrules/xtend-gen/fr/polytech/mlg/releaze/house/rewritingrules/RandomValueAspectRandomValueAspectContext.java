package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.RandomValue;
import fr.polytech.mlg.releaze.house.rewritingrules.RandomValueAspectRandomValueAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class RandomValueAspectRandomValueAspectContext {
  public final static RandomValueAspectRandomValueAspectContext INSTANCE = new RandomValueAspectRandomValueAspectContext();
  
  public static RandomValueAspectRandomValueAspectProperties getSelf(final RandomValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.RandomValueAspectRandomValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RandomValue, RandomValueAspectRandomValueAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.RandomValue, fr.polytech.mlg.releaze.house.rewritingrules.RandomValueAspectRandomValueAspectProperties>();
  
  public Map<RandomValue, RandomValueAspectRandomValueAspectProperties> getMap() {
    return map;
  }
}
