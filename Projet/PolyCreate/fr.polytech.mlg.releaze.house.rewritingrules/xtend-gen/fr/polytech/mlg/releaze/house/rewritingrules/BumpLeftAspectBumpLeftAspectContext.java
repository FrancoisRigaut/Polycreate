package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.BumpLeft;
import fr.polytech.mlg.releaze.house.rewritingrules.BumpLeftAspectBumpLeftAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BumpLeftAspectBumpLeftAspectContext {
  public final static BumpLeftAspectBumpLeftAspectContext INSTANCE = new BumpLeftAspectBumpLeftAspectContext();
  
  public static BumpLeftAspectBumpLeftAspectProperties getSelf(final BumpLeft _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.BumpLeftAspectBumpLeftAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BumpLeft, BumpLeftAspectBumpLeftAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.BumpLeft, fr.polytech.mlg.releaze.house.rewritingrules.BumpLeftAspectBumpLeftAspectProperties>();
  
  public Map<BumpLeft, BumpLeftAspectBumpLeftAspectProperties> getMap() {
    return map;
  }
}
