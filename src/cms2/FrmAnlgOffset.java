package cms2;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Windows.Forms.*;
import jio.System.*;
import cms2.*;
import jio.System.Drawing.*;
import jio.System.ComponentModel.*;

public class FrmAnlgOffset extends Form
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent,
        IContainerControl {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setContentFont(Font value) {
    try {
      javonetHandle.set("ContentFont", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Font getContentFont() {
    try {
      Object res = javonetHandle.<NObject>get("ContentFont");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setButtonFont(Font value) {
    try {
      javonetHandle.set("ButtonFont", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Font getButtonFont() {
    try {
      Object res = javonetHandle.<NObject>get("ButtonFont");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBackColor(Color value) {
    try {
      javonetHandle.set("BackColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getBackColor() {
    try {
      Object res = javonetHandle.<NObject>get("BackColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short[] getAnlgOffset(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("AnlgOffset");
      if (res == null) return null;
      return (java.lang.Short[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAnlgOffset(java.lang.Short[] param) {
    try {
      javonetHandle.set("AnlgOffset", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Color[] getWvColor(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("WvColor");
      if (res == null) return null;
      return (Color[]) JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setWvColor(Color[] param) {
    try {
      javonetHandle.set("WvColor", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String[] getWvSignalName(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("WvSignalName");
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setWvSignalName(java.lang.String[] param) {
    try {
      javonetHandle.set("WvSignalName", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FrmAnlgOffset() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("cms2.FrmAnlgOffset");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ButtonOK",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FrmAnlgOffset.ButtonOKEventHandler handler : _ButtonOKListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FrmAnlgOffset(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<FrmAnlgOffset.ButtonOKEventHandler> _ButtonOKListeners =
      new java.util.ArrayList<FrmAnlgOffset.ButtonOKEventHandler>();

  public void addButtonOK(FrmAnlgOffset.ButtonOKEventHandler toAdd) {
    _ButtonOKListeners.add(toAdd);
  }

  public void removeButtonOK(FrmAnlgOffset.ButtonOKEventHandler toRemove) {
    _ButtonOKListeners.remove(toRemove);
  }

  public interface ButtonOKEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, EventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
