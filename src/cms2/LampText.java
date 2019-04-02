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
import cms2.*;
import jio.System.*;
import jio.System.Drawing.*;
import jio.System.ComponentModel.*;

public class LampText extends UserControl
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
  public void setLabel1(Label WithEventsValue) {
    try {
      javonetHandle.set("Label1", WithEventsValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Label getLabel1() {
    try {
      Object res = javonetHandle.<NObject>get("Label1");
      if (res == null) return null;
      return new Label((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLamp1(lamp WithEventsValue) {
    try {
      javonetHandle.set("Lamp1", WithEventsValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public lamp getLamp1() {
    try {
      Object res = javonetHandle.<NObject>get("Lamp1");
      if (res == null) return null;
      return new lamp((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSignalID(java.lang.Integer Value) {
    try {
      javonetHandle.set("SignalID", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSignalID() {
    try {
      java.lang.Integer res = javonetHandle.get("SignalID");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLampEnable(java.lang.Boolean Value) {
    try {
      javonetHandle.set("LampEnable", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getLampEnable() {
    try {
      java.lang.Boolean res = javonetHandle.get("LampEnable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMagScale(java.lang.Double value) {
    try {
      javonetHandle.set("MagScale", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getMagScale() {
    try {
      java.lang.Double res = javonetHandle.get("MagScale");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextLamp(java.lang.String Value) {
    try {
      javonetHandle.set("TextLamp", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTextLamp() {
    try {
      java.lang.String res = javonetHandle.get("TextLamp");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLampColorOn(lamp.Lamp_Color Value) {
    try {
      javonetHandle.set("LampColorOn", NEnum.fromJavaEnum(Value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public lamp.Lamp_Color getLampColorOn() {
    try {
      Object res = javonetHandle.<NEnum>get("LampColorOn");
      if (res == null) return null;
      return lamp.Lamp_Color.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLampColorOff(lamp.Lamp_Color Value) {
    try {
      javonetHandle.set("LampColorOff", NEnum.fromJavaEnum(Value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public lamp.Lamp_Color getLampColorOff() {
    try {
      Object res = javonetHandle.<NEnum>get("LampColorOff");
      if (res == null) return null;
      return lamp.Lamp_Color.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFontText(Font Value) {
    try {
      javonetHandle.set("FontText", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Font getFontText() {
    try {
      Object res = javonetHandle.<NObject>get("FontText");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setColorText(Color Value) {
    try {
      javonetHandle.set("ColorText", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getColorText() {
    try {
      Object res = javonetHandle.<NObject>get("ColorText");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLampState(java.lang.Boolean Value) {
    try {
      javonetHandle.set("LampState", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getLampState() {
    try {
      java.lang.Boolean res = javonetHandle.get("LampState");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public LampText() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("cms2.LampText");
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "MyDown",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (LampText.MyDownEventHandler handler : _MyDownListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], MouseEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MyDbClick",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (LampText.MyDbClickEventHandler handler : _MyDbClickListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LampText(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Copy(LampText Ori, LampText Copy) {
    try {
      Javonet.getType("cms2.LampText").invoke("Copy", Ori, Copy);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void BindingsWrite(LampText Sender) {
    try {
      Javonet.getType("cms2.LampText").invoke("BindingsWrite", Sender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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

  private java.util.ArrayList<LampText.MyDownEventHandler> _MyDownListeners =
      new java.util.ArrayList<LampText.MyDownEventHandler>();

  public void addMyDown(LampText.MyDownEventHandler toAdd) {
    _MyDownListeners.add(toAdd);
  }

  public void removeMyDown(LampText.MyDownEventHandler toRemove) {
    _MyDownListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<LampText.MyDbClickEventHandler> _MyDbClickListeners =
      new java.util.ArrayList<LampText.MyDbClickEventHandler>();

  public void addMyDbClick(LampText.MyDbClickEventHandler toAdd) {
    _MyDbClickListeners.add(toAdd);
  }

  public void removeMyDbClick(LampText.MyDbClickEventHandler toRemove) {
    _MyDbClickListeners.remove(toRemove);
  }

  public interface MyDownEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, MouseEventArgs e);
  }

  public interface MyDbClickEventHandler {
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
