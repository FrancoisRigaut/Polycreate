package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable;
import fr.polytech.mlg.releaze.house.rewritingrules.ObjectGrabbableAspectObjectGrabbableAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ObjectGrabbableAspectObjectGrabbableAspectContext {
  public final static ObjectGrabbableAspectObjectGrabbableAspectContext INSTANCE = new ObjectGrabbableAspectObjectGrabbableAspectContext();
  
  public static ObjectGrabbableAspectObjectGrabbableAspectProperties getSelf(final ObjectGrabbable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.ObjectGrabbableAspectObjectGrabbableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObjectGrabbable, ObjectGrabbableAspectObjectGrabbableAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable, fr.polytech.mlg.releaze.house.rewritingrules.ObjectGrabbableAspectObjectGrabbableAspectProperties>();
  
  public Map<ObjectGrabbable, ObjectGrabbableAspectObjectGrabbableAspectProperties> getMap() {
    return map;
  }
}
