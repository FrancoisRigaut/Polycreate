// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJTurn{
void around (fr.polytech.mlg.releaze.house.polycreate.Turn self)  :target (self) && (call ( void fr.polytech.mlg.releaze.house.polycreate.Turn.runIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { fr.polytech.mlg.releaze.house.rewritingrules.TurnAspect.runIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
