package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.NumeralValue;
import fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspectNumeralValueAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class NumeralValueAspectNumeralValueAspectContext {
  public final static NumeralValueAspectNumeralValueAspectContext INSTANCE = new NumeralValueAspectNumeralValueAspectContext();
  
  public static NumeralValueAspectNumeralValueAspectProperties getSelf(final NumeralValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspectNumeralValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumeralValue, NumeralValueAspectNumeralValueAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.NumeralValue, fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspectNumeralValueAspectProperties>();
  
  public Map<NumeralValue, NumeralValueAspectNumeralValueAspectProperties> getMap() {
    return map;
  }
}
