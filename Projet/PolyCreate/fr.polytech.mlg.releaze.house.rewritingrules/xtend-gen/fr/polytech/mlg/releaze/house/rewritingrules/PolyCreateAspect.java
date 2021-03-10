package fr.polytech.mlg.releaze.house.rewritingrules;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.polytech.mlg.releaze.house.polycreate.Event;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.polycreate.State;
import fr.polytech.mlg.releaze.house.rewritingrules.EventAspect;
import fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectProperties;
import fr.polytech.mlg.releaze.house.rewritingrules.StateAspect;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@Aspect(className = Program.class)
@SuppressWarnings("all")
public class PolyCreateAspect {
  @Main
  public static void entryPoint(final Program _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void entryPoint()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Program){
    	fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect._privk3_entryPoint(_self_, (fr.polytech.mlg.releaze.house.polycreate.Program)_self);
    };
  }
  
  @ReplaceAspectMethod
  public static State getCurrentState(final Program _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State getCurrentState()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Program){
    	result = fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect._privk3_getCurrentState(_self_, (fr.polytech.mlg.releaze.house.polycreate.Program)_self);
    };
    return (fr.polytech.mlg.releaze.house.polycreate.State)result;
  }
  
  @ReplaceAspectMethod
  public static boolean scanEvents(final Program _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean scanEvents()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Program){
    	result = fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect._privk3_scanEvents(_self_, (fr.polytech.mlg.releaze.house.polycreate.Program)_self);
    };
    return (boolean)result;
  }
  
  public static PolyCreateControler ctrl(final Program _self) {
    final fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCreateControler ctrl()
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Program){
    	result = fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect._privk3_ctrl(_self_, (fr.polytech.mlg.releaze.house.polycreate.Program)_self);
    };
    return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)result;
  }
  
  public static void ctrl(final Program _self, final PolyCreateControler ctrl) {
    final fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectProperties _self_ = fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspectProgramAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void ctrl(PolyCreateControler)
    if (_self instanceof fr.polytech.mlg.releaze.house.polycreate.Program){
    	fr.polytech.mlg.releaze.house.rewritingrules.PolyCreateAspect._privk3_ctrl(_self_, (fr.polytech.mlg.releaze.house.polycreate.Program)_self,ctrl);
    };
  }
  
  protected static void _privk3_entryPoint(final PolyCreateAspectProgramAspectProperties _self_, final Program _self) {
    PolyCreateControler _polyCreateControler = new PolyCreateControler();
    PolyCreateAspect.ctrl(_self, _polyCreateControler);
    while (true) {
      {
        PolyCreateAspect.scanEvents(_self);
        final State s = PolyCreateAspect.getCurrentState(_self);
        StateAspect.runIt(s, _self);
      }
    }
  }
  
  protected static State _privk3_getCurrentState(final PolyCreateAspectProgramAspectProperties _self_, final Program _self) {
    EList<State> _states = _self.getStates();
    for (final State s : _states) {
      String _name = s.getName();
      String _currentStateName = _self.getCurrentStateName();
      boolean _equals = Objects.equal(_name, _currentStateName);
      if (_equals) {
        return s;
      }
    }
    return null;
  }
  
  protected static boolean _privk3_scanEvents(final PolyCreateAspectProgramAspectProperties _self_, final Program _self) {
    int i = 0;
    boolean found = false;
    while (((i < _self.getEvents().size()) && (!found))) {
      {
        Event e = _self.getEvents().get(i);
        final Function1<State, String> _function = (State it) -> {
          return it.getName();
        };
        boolean _contains = ListExtensions.<State, String>map(e.getStates(), _function).contains(_self.getCurrentStateName());
        if (_contains) {
          if (found = EventAspect.scanIt(e, _self)) {
            while (true) {
              EventAspect.runIt(e, _self);
            }
          }
        }
        i++;
      }
    }
    return found;
  }
  
  protected static PolyCreateControler _privk3_ctrl(final PolyCreateAspectProgramAspectProperties _self_, final Program _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCtrl") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.ctrl;
  }
  
  protected static void _privk3_ctrl(final PolyCreateAspectProgramAspectProperties _self_, final Program _self, final PolyCreateControler ctrl) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCtrl")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, ctrl);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.ctrl = ctrl;
    }
  }
}
