// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJGoTo{
void around (fr.polytech.mlg.releaze.house.polycreate.GoTo self)  :target (self) && (call ( void fr.polytech.mlg.releaze.house.polycreate.GoTo.runIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { fr.polytech.mlg.releaze.house.rewritingrules.GoToAspect.runIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
