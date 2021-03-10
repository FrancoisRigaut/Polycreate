// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJOpenGrip{
void around (fr.polytech.mlg.releaze.house.polycreate.OpenGrip self)  :target (self) && (call ( void fr.polytech.mlg.releaze.house.polycreate.OpenGrip.runIt( fr.polytech.mlg.releaze.house.polycreate.Program ) ) ) { fr.polytech.mlg.releaze.house.rewritingrules.OpenGripAspect.runIt(self,(fr.polytech.mlg.releaze.house.polycreate.Program)thisJoinPoint.getArgs()[0] );}

}
