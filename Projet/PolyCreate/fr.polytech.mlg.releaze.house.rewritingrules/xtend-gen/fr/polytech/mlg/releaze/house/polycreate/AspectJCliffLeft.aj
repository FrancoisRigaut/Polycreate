// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJCliffLeft{
boolean around (fr.polytech.mlg.releaze.house.polycreate.CliffLeft self)  :target (self) && (call ( boolean fr.polytech.mlg.releaze.house.polycreate.CliffLeft.scanIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.CliffLeftAspect.scanIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
