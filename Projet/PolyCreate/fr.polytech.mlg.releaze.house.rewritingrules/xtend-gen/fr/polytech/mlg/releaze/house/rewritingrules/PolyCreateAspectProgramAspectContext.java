package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PolyCreateAspectProgramAspectContext {
  public final static PolyCreateAspectProgramAspectContext INSTANCE = new PolyCreateAspectProgramAspectContext();
  
  public static PolyCreateAspectProgramAspectProperties getSelf(final Program _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Program, PolyCreateAspectProgramAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.Program, fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectProperties>();
  
  public Map<Program, PolyCreateAspectProgramAspectProperties> getMap() {
    return map;
  }
}
