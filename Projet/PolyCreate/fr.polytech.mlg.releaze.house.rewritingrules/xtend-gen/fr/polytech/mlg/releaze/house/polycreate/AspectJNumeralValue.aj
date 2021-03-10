// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJNumeralValue{
int around (fr.polytech.mlg.releaze.house.polycreate.NumeralValue self)  :target (self) && (call ( int fr.polytech.mlg.releaze.house.polycreate.NumeralValue.get(  ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.NumeralValueAspect.get(self );}

}
