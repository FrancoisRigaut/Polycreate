// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJState{
void around (fr.polytech.mlg.releaze.house.polycreate.State self)  :target (self) && (call ( void fr.polytech.mlg.releaze.house.polycreate.State.runIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { fr.polytech.mlg.releaze.house.rewritingrules.StateAspect.runIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
