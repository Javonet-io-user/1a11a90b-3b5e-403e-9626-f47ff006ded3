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

public class GaugeBar extends PictureBox
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent,
        ISupportInitialize {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRotateState(GaugeBar.Rotate_State value) {
    try {
      javonetHandle.set("RotateState", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public GaugeBar.Rotate_State getRotateState() {
    try {
      Object res = javonetHandle.<NEnum>get("RotateState");
      if (res == null) return null;
      return GaugeBar.Rotate_State.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValueVisible(java.lang.Boolean value) {
    try {
      javonetHandle.set("ValueVisible", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getValueVisible() {
    try {
      java.lang.Boolean res = javonetHandle.get("ValueVisible");
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
  public void setMax(java.lang.Integer Value) {
    try {
      javonetHandle.set("Max", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMax() {
    try {
      java.lang.Integer res = javonetHandle.get("Max");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMin(java.lang.Integer Value) {
    try {
      javonetHandle.set("Min", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMin() {
    try {
      java.lang.Integer res = javonetHandle.get("Min");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValue(java.lang.Double Temp) {
    try {
      javonetHandle.set("Value", Temp);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getValue() {
    try {
      java.lang.Double res = javonetHandle.get("Value");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGaugeColor(Color Value) {
    try {
      javonetHandle.set("GaugeColor", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getGaugeColor() {
    try {
      Object res = javonetHandle.<NObject>get("GaugeColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGaugeBackColor(Color Value) {
    try {
      javonetHandle.set("GaugeBackColor", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getGaugeBackColor() {
    try {
      Object res = javonetHandle.<NObject>get("GaugeBackColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAlarmEnable(java.lang.Boolean Value) {
    try {
      javonetHandle.set("AlarmEnable", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAlarmEnable() {
    try {
      java.lang.Boolean res = javonetHandle.get("AlarmEnable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAlarmValue(java.lang.Double Temp) {
    try {
      javonetHandle.set("AlarmValue", Temp);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getAlarmValue() {
    try {
      java.lang.Double res = javonetHandle.get("AlarmValue");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHysteresis(java.lang.Double Value) {
    try {
      javonetHandle.set("Hysteresis", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getHysteresis() {
    try {
      java.lang.Double res = javonetHandle.get("Hysteresis");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAlarmColor(Color Value) {
    try {
      javonetHandle.set("AlarmColor", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getAlarmColor() {
    try {
      Object res = javonetHandle.<NObject>get("AlarmColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAlarmBackColor(Color Value) {
    try {
      javonetHandle.set("AlarmBackColor", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getAlarmBackColor() {
    try {
      Object res = javonetHandle.<NObject>get("AlarmBackColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDenominantion(java.lang.String value) {
    try {
      javonetHandle.set("Denominantion", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDenominantion() {
    try {
      java.lang.String res = javonetHandle.get("Denominantion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTitleText(java.lang.String value) {
    try {
      javonetHandle.set("TitleText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTitleText() {
    try {
      java.lang.String res = javonetHandle.get("TitleText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public GaugeBar() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("cms2.GaugeBar");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Alart",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GaugeBar.AlartEventHandler handler : _AlartListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GaugeBar(NObject handle) {
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

  private java.util.ArrayList<GaugeBar.AlartEventHandler> _AlartListeners =
      new java.util.ArrayList<GaugeBar.AlartEventHandler>();

  public void addAlart(GaugeBar.AlartEventHandler toAdd) {
    _AlartListeners.add(toAdd);
  }

  public void removeAlart(GaugeBar.AlartEventHandler toRemove) {
    _AlartListeners.remove(toRemove);
  }

  public enum Rotate_State {
    None(0L),
    Rotate90(1L),
    Rotate180(2L),
    Rotate270(3L),
    ;
    private long numVal;

    Rotate_State(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public interface AlartEventHandler {
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
