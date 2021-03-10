package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.CliffRight;
import fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspectCliffRightAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class CliffRightAspectCliffRightAspectContext {
  public final static CliffRightAspectCliffRightAspectContext INSTANCE = new CliffRightAspectCliffRightAspectContext();
  
  public static CliffRightAspectCliffRightAspectProperties getSelf(final CliffRight _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspectCliffRightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CliffRight, CliffRightAspectCliffRightAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.CliffRight, fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspectCliffRightAspectProperties>();
  
  public Map<CliffRight, CliffRightAspectCliffRightAspectProperties> getMap() {
    return map;
  }
}
