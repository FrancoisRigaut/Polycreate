package fr.polytech.mlg.releaze.house.design;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.polytech.mlg.releaze.house.polycreate.*;

/**
 * The services class used by VSM.
 */
public class Services {
    
    public Instruction getNextInstruction(Instruction inst) {
    	InstructionsSet s = (InstructionsSet)inst.eContainer();
    	List<Instruction> insts = s.getInstructions();
    	int i = insts.indexOf(inst);
    	if (i == insts.size()-1)
    		return null;
    	else
    		return insts.get(i+1);
    }
    
    public List<State> getLinkedStates(Event e) {
    	return e.getStates();
    }
    
    public boolean isInEvent(Instruction i) {
    	return i.eContainer() instanceof Event;
    }
}
