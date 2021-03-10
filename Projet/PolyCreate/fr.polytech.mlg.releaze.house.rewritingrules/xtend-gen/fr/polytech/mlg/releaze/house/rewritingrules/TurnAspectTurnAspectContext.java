package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.Turn;
import fr.polytech.mlg.releaze.house.rewritingrules.TurnAspectTurnAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TurnAspectTurnAspectContext {
  public final static TurnAspectTurnAspectContext INSTANCE = new TurnAspectTurnAspectContext();
  
  public static TurnAspectTurnAspectProperties getSelf(final Turn _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.TurnAspectTurnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Turn, TurnAspectTurnAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.Turn, fr.polytech.mlg.releaze.house.rewritingrules.TurnAspectTurnAspectProperties>();
  
  public Map<Turn, TurnAspectTurnAspectProperties> getMap() {
    return map;
  }
}
