package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.GoForward;
import fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspectGoForwardAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class GoForwardAspectGoForwardAspectContext {
  public final static GoForwardAspectGoForwardAspectContext INSTANCE = new GoForwardAspectGoForwardAspectContext();
  
  public static GoForwardAspectGoForwardAspectProperties getSelf(final GoForward _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspectGoForwardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GoForward, GoForwardAspectGoForwardAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.GoForward, fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspectGoForwardAspectProperties>();
  
  public Map<GoForward, GoForwardAspectGoForwardAspectProperties> getMap() {
    return map;
  }
}
