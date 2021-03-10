// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJInstruction{
void around (fr.polytech.mlg.releaze.house.polycreate.Instruction self)  :target (self) && (call ( void fr.polytech.mlg.releaze.house.polycreate.Instruction.runIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { fr.polytech.mlg.releaze.house.rewritingrules.InstructionAspect.runIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
