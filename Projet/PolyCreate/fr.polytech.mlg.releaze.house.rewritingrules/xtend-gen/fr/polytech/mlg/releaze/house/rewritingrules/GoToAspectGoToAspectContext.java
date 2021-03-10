package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.GoTo;
import fr.polytech.mlg.releaze.house.rewritingrules.GoToAspectGoToAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class GoToAspectGoToAspectContext {
  public final static GoToAspectGoToAspectContext INSTANCE = new GoToAspectGoToAspectContext();
  
  public static GoToAspectGoToAspectProperties getSelf(final GoTo _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.GoToAspectGoToAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GoTo, GoToAspectGoToAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.GoTo, fr.polytech.mlg.releaze.house.rewritingrules.GoToAspectGoToAspectProperties>();
  
  public Map<GoTo, GoToAspectGoToAspectProperties> getMap() {
    return map;
  }
}
