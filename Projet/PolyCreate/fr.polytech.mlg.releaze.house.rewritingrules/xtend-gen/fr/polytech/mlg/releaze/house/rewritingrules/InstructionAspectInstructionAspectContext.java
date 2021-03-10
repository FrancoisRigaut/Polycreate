package fr.polytech.mlg.releaze.house.rewritingrules;

import fr.polytech.mlg.releaze.house.polycreate.Instruction;
import fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspectInstructionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class InstructionAspectInstructionAspectContext {
  public final static InstructionAspectInstructionAspectContext INSTANCE = new InstructionAspectInstructionAspectContext();
  
  public static InstructionAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instruction, InstructionAspectInstructionAspectProperties> map = new java.util.WeakHashMap<fr.polytech.mlg.releaze.house.polycreate.Instruction, fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspectInstructionAspectProperties>();
  
  public Map<Instruction, InstructionAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
