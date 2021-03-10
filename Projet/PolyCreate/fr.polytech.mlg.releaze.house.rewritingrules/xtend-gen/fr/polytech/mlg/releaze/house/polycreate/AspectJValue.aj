// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJValue{
int around (fr.polytech.mlg.releaze.house.polycreate.Value self)  :target (self) && (call ( int fr.polytech.mlg.releaze.house.polycreate.Value.get(  ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.ValueAspect.get(self );}

}
