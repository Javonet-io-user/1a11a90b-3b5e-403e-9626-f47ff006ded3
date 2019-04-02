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

public class ButtonTile extends UserControl
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
  public void setFunctionFont(Font value) {
    try {
      javonetHandle.set("FunctionFont", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Font getFunctionFont() {
    try {
      Object res = javonetHandle.<NObject>get("FunctionFont");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getExitCMSFlag() {
    try {
      java.lang.Short res = javonetHandle.get("ExitCMSFlag");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getNot_Click_End() {
    try {
      java.lang.Short res = javonetHandle.get("Not_Click_End");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelf_Title(java.lang.String value) {
    try {
      javonetHandle.set("Self_Title", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSelf_Title() {
    try {
      java.lang.String res = javonetHandle.get("Self_Title");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelf_Screen(java.lang.Short value) {
    try {
      javonetHandle.set("Self_Screen", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getSelf_Screen() {
    try {
      java.lang.Short res = javonetHandle.get("Self_Screen");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonitorCrane(java.lang.Short value) {
    try {
      javonetHandle.set("MonitorCrane", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getMonitorCrane() {
    try {
      java.lang.Short res = javonetHandle.get("MonitorCrane");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUserLevel(java.lang.Short value) {
    try {
      javonetHandle.set("UserLevel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getUserLevel() {
    try {
      java.lang.Short res = javonetHandle.get("UserLevel");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDataLevel(java.lang.Short value) {
    try {
      javonetHandle.set("DataLevel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getDataLevel() {
    try {
      java.lang.Short res = javonetHandle.get("DataLevel");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPlcOffLineStatic(java.lang.Boolean value) {
    try {
      javonetHandle.set("PlcOffLineStatic", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPlcOffLineStatic() {
    try {
      java.lang.Boolean res = javonetHandle.get("PlcOffLineStatic");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCraneTypeSelect(ButtonTile.CraneType value) {
    try {
      javonetHandle.set("CraneTypeSelect", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ButtonTile.CraneType getCraneTypeSelect() {
    try {
      Object res = javonetHandle.<NEnum>get("CraneTypeSelect");
      if (res == null) return null;
      return ButtonTile.CraneType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public ButtonTile() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("cms2.ButtonTile");
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "ExitDisplay",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ButtonTile.ExitDisplayEventHandler handler : _ExitDisplayListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ButtonTile(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ModeSet(ButtonTile.GroupDef Mode) {
    try {
      javonetHandle.invoke("ModeSet", NEnum.fromJavaEnum(Mode));
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

  private java.util.ArrayList<ButtonTile.ExitDisplayEventHandler> _ExitDisplayListeners =
      new java.util.ArrayList<ButtonTile.ExitDisplayEventHandler>();

  public void addExitDisplay(ButtonTile.ExitDisplayEventHandler toAdd) {
    _ExitDisplayListeners.add(toAdd);
  }

  public void removeExitDisplay(ButtonTile.ExitDisplayEventHandler toRemove) {
    _ExitDisplayListeners.remove(toRemove);
  }

  public enum GroupDef {
    Top(0L),
    Menu(1L),
    Break(2L),
    Trace(3L),
    Data(4L),
    Mente(5L),
    Utility(6L),
    Tool(7L),
    ;
    private long numVal;

    GroupDef(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public enum CraneType {
    PT(0L),
    TT(1L),
    ;
    private long numVal;

    CraneType(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public interface ExitDisplayEventHandler {
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
