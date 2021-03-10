// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJBumpRight{
boolean around (fr.polytech.mlg.releaze.house.polycreate.BumpRight self)  :target (self) && (call ( boolean fr.polytech.mlg.releaze.house.polycreate.BumpRight.scanIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.BumpRightAspect.scanIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
