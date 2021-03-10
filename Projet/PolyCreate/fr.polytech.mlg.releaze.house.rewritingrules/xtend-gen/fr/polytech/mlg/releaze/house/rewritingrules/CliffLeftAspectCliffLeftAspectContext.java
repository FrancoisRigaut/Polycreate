package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.CliffLeft;
import fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspectCliffLeftAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class CliffLeftAspectCliffLeftAspectContext {
  public final static CliffLeftAspectCliffLeftAspectContext INSTANCE = new CliffLeftAspectCliffLeftAspectContext();
  
  public static CliffLeftAspectCliffLeftAspectProperties getSelf(final CliffLeft _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspectCliffLeftAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CliffLeft, CliffLeftAspectCliffLeftAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.CliffLeft, fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspectCliffLeftAspectProperties>();
  
  public Map<CliffLeft, CliffLeftAspectCliffLeftAspectProperties> getMap() {
    return map;
  }
}
