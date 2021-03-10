// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJAtStartingPoint{
boolean around (fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint self)  :target (self) && (call ( boolean fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint.scanIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.AtStartingPointAspect.scanIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
