// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJObjectGrabbable{
boolean around (fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable self)  :target (self) && (call ( boolean fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable.scanIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.ObjectGrabbableAspect.scanIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
