package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.Value;
import fr.polytech.mlg.releaze.house.rewritingrules.ValueAspectValueAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ValueAspectValueAspectContext {
  public final static ValueAspectValueAspectContext INSTANCE = new ValueAspectValueAspectContext();
  
  public static ValueAspectValueAspectProperties getSelf(final Value _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.ValueAspectValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Value, ValueAspectValueAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.Value, fr.polytech.mlg.releaze.house.rewritingrules.ValueAspectValueAspectProperties>();
  
  public Map<Value, ValueAspectValueAspectProperties> getMap() {
    return map;
  }
}
