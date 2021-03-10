// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJRandomValue{
int around (fr.polytech.mlg.releaze.house.polycreate.RandomValue self)  :target (self) && (call ( int fr.polytech.mlg.releaze.house.polycreate.RandomValue.get(  ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.RandomValueAspect.get(self );}

}
