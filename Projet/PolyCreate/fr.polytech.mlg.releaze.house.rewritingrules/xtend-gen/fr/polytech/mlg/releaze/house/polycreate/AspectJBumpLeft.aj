// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJBumpLeft{
boolean around (fr.polytech.mlg.releaze.house.polycreate.BumpLeft self)  :target (self) && (call ( boolean fr.polytech.mlg.releaze.house.polycreate.BumpLeft.scanIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.BumpLeftAspect.scanIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
