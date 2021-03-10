// AspectJ classes that have been aspectized and name
package fr.polytech.mlg.releaze.house.polycreate;
public aspect AspectJProgram{
State around (fr.polytech.mlg.releaze.house.polycreate.Program self)  :target (self) && (call ( fr.polytech.mlg.releaze.house.polycreate.State fr.polytech.mlg.releaze.house.polycreate.Program.getCurrentState(  ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect.getCurrentState(self );}
boolean around (fr.polytech.mlg.releaze.house.polycreate.Program self)  :target (self) && (call ( boolean fr.polytech.mlg.releaze.house.polycreate.Program.scanEvents(  ) ) ) { return fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect.scanEvents(self );}

}
