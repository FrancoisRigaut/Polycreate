package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.Event;
import fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class EventAspectEventAspectContext {
  public final static EventAspectEventAspectContext INSTANCE = new EventAspectEventAspectContext();
  
  public static EventAspectEventAspectProperties getSelf(final Event _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Event, EventAspectEventAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.Event, fr.polytech.mlg.releaze.house.rewritingrules.EventAspectEventAspectProperties>();
  
  public Map<Event, EventAspectEventAspectProperties> getMap() {
    return map;
  }
}
