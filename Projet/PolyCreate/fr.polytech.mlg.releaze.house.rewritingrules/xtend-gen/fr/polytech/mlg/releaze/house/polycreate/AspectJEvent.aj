// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJEvent{
boolean around (fr.polytech.mlg.releaze.house.polycreate.Event self)  :target (self) && (call ( boolean fr.polytech.mlg.releaze.house.polycreate.Event.scanIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.EventAspect.scanIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}
void around (fr.polytech.mlg.releaze.house.polycreate.Event self)  :target (self) && (call ( void fr.polytech.mlg.releaze.house.polycreate.Event.runIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { fr.polytech.mlg.releaze.house.rewritingrules.EventAspect.runIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
