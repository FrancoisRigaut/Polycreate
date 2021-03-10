// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJCloseGrip{
void around (fr.polytech.mlg.releaze.house.polycreate.CloseGrip self)  :target (self) && (call ( void fr.polytech.mlg.releaze.house.polycreate.CloseGrip.runIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { fr.polytech.mlg.releaze.house.rewritingrules.CloseGripAspect.runIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
