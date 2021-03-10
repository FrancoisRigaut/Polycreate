package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint;
import fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AtStartingPointAspectAtStartingPointAspectContext {
  public final static AtStartingPointAspectAtStartingPointAspectContext INSTANCE = new AtStartingPointAspectAtStartingPointAspectContext();
  
  public static AtStartingPointAspectAtStartingPointAspectProperties getSelf(final AtStartingPoint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AtStartingPoint, AtStartingPointAspectAtStartingPointAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint, fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspectAtStartingPointAspectProperties>();
  
  public Map<AtStartingPoint, AtStartingPointAspectAtStartingPointAspectProperties> getMap() {
    return map;
  }
}
