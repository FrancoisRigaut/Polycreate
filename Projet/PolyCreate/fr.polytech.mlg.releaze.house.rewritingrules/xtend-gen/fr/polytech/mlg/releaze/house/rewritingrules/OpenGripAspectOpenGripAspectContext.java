package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.OpenGrip;
import fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspectOpenGripAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class OpenGripAspectOpenGripAspectContext {
  public final static OpenGripAspectOpenGripAspectContext INSTANCE = new OpenGripAspectOpenGripAspectContext();
  
  public static OpenGripAspectOpenGripAspectProperties getSelf(final OpenGrip _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspectOpenGripAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OpenGrip, OpenGripAspectOpenGripAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.OpenGrip, fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspectOpenGripAspectProperties>();
  
  public Map<OpenGrip, OpenGripAspectOpenGripAspectProperties> getMap() {
    return map;
  }
}
