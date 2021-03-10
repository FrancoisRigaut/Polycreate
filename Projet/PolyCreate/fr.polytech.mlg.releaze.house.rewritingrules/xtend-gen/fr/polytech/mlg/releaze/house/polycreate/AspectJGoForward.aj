// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJGoForward{
void around (fr.polytech.mlg.releaze.house.polycreate.GoForward self)  :target (self) && (call ( void fr.polytech.mlg.releaze.house.polycreate.GoForward.runIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { fr.polytech.mlg.releaze.house.rewritingrules.GoForwardAspect.runIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
