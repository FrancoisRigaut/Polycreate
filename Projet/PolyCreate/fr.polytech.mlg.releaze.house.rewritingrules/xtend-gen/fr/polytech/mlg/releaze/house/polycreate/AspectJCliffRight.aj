// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJCliffRight{
boolean around (fr.polytech.mlg.releaze.house.polycreate.CliffRight self)  :target (self) && (call ( boolean fr.polytech.mlg.releaze.house.polycreate.CliffRight.scanIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.CliffRightAspect.scanIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
