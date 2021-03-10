package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.CliffFront;
import fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspectCliffFrontAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class CliffFrontAspectCliffFrontAspectContext {
  public final static CliffFrontAspectCliffFrontAspectContext INSTANCE = new CliffFrontAspectCliffFrontAspectContext();
  
  public static CliffFrontAspectCliffFrontAspectProperties getSelf(final CliffFront _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspectCliffFrontAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CliffFront, CliffFrontAspectCliffFrontAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.CliffFront, fr.polytech.mlg.releaze.house.rewritingrules.CliffFrontAspectCliffFrontAspectProperties>();
  
  public Map<CliffFront, CliffFrontAspectCliffFrontAspectProperties> getMap() {
    return map;
  }
}
