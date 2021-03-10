package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.BumpRight;
import fr.polytech.mlg.releaze.house.rewritingrules.BumpRightAspectBumpRightAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BumpRightAspectBumpRightAspectContext {
  public final static BumpRightAspectBumpRightAspectContext INSTANCE = new BumpRightAspectBumpRightAspectContext();
  
  public static BumpRightAspectBumpRightAspectProperties getSelf(final BumpRight _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.BumpRightAspectBumpRightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BumpRight, BumpRightAspectBumpRightAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.BumpRight, fr.polytech.mlg.releaze.house.rewritingrules.BumpRightAspectBumpRightAspectProperties>();
  
  public Map<BumpRight, BumpRightAspectBumpRightAspectProperties> getMap() {
    return map;
  }
}
