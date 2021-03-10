package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.CloseGrip;
import fr.polytech.mlg.releaze.house.rewritingrules.CloseGripAspectCloseGripAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class CloseGripAspectCloseGripAspectContext {
  public final static CloseGripAspectCloseGripAspectContext INSTANCE = new CloseGripAspectCloseGripAspectContext();
  
  public static CloseGripAspectCloseGripAspectProperties getSelf(final CloseGrip _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.CloseGripAspectCloseGripAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CloseGrip, CloseGripAspectCloseGripAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.CloseGrip, fr.polytech.mlg.releaze.house.rewritingrules.CloseGripAspectCloseGripAspectProperties>();
  
  public Map<CloseGrip, CloseGripAspectCloseGripAspectProperties> getMap() {
    return map;
  }
}
