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

public class CustomGraph extends UserControl
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
  public void setcmdCrR(Button WithEventsValue) {
    try {
      javonetHandle.set("cmdCrR", WithEventsValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Button getcmdCrR() {
    try {
      Object res = javonetHandle.<NObject>get("cmdCrR");
      if (res == null) return null;
      return new Button((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setcmdCrL(Button WithEventsValue) {
    try {
      javonetHandle.set("cmdCrL", WithEventsValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Button getcmdCrL() {
    try {
      Object res = javonetHandle.<NObject>get("cmdCrL");
      if (res == null) return null;
      return new Button((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLineLbl(Label WithEventsValue) {
    try {
      javonetHandle.set("LineLbl", WithEventsValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Label getLineLbl() {
    try {
      Object res = javonetHandle.<NObject>get("LineLbl");
      if (res == null) return null;
      return new Label((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
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
  public void setGraphFont(Font value) {
    try {
      javonetHandle.set("GraphFont", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Font getGraphFont() {
    try {
      Object res = javonetHandle.<NObject>get("GraphFont");
      if (res == null) return null;
      return new Font((NObject) res);
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
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMojiColor(Color value) {
    try {
      javonetHandle.set("MojiColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getMojiColor() {
    try {
      Object res = javonetHandle.<NObject>get("MojiColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDataNum_Anlg(java.lang.Short value) {
    try {
      javonetHandle.set("DataNum_Anlg", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getDataNum_Anlg() {
    try {
      java.lang.Short res = javonetHandle.get("DataNum_Anlg");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDataNum_Dgtl(java.lang.Short value) {
    try {
      javonetHandle.set("DataNum_Dgtl", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getDataNum_Dgtl() {
    try {
      java.lang.Short res = javonetHandle.get("DataNum_Dgtl");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setScaleX_Max(java.lang.Short value) {
    try {
      javonetHandle.set("ScaleX_Max", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getScaleX_Max() {
    try {
      java.lang.Short res = javonetHandle.get("ScaleX_Max");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setScaleX_Min(java.lang.Short value) {
    try {
      javonetHandle.set("ScaleX_Min", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getScaleX_Min() {
    try {
      java.lang.Short res = javonetHandle.get("ScaleX_Min");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setScaleX_Div(java.lang.Short value) {
    try {
      javonetHandle.set("ScaleX_Div", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getScaleX_Div() {
    try {
      java.lang.Short res = javonetHandle.get("ScaleX_Div");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCursolPos_X(java.lang.Short value) {
    try {
      javonetHandle.set("CursolPos_X", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getCursolPos_X() {
    try {
      java.lang.Short res = javonetHandle.get("CursolPos_X");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCursolVisible() {
    try {
      java.lang.String res = javonetHandle.get("CursolVisible");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setButtonVisible_Cursol(java.lang.Boolean value) {
    try {
      javonetHandle.set("ButtonVisible_Cursol", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getButtonVisible_Cursol() {
    try {
      java.lang.Boolean res = javonetHandle.get("ButtonVisible_Cursol");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setButtonVisible_AnlgOffset(java.lang.Boolean value) {
    try {
      javonetHandle.set("ButtonVisible_AnlgOffset", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getButtonVisible_AnlgOffset() {
    try {
      java.lang.Boolean res = javonetHandle.get("ButtonVisible_AnlgOffset");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setButtonVisible_CSVsave(java.lang.Boolean value) {
    try {
      javonetHandle.set("ButtonVisible_CSVsave", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getButtonVisible_CSVsave() {
    try {
      java.lang.Boolean res = javonetHandle.get("ButtonVisible_CSVsave");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCursol_1click(java.lang.Boolean value) {
    try {
      javonetHandle.set("Cursol_1click", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCursol_1click() {
    try {
      java.lang.Boolean res = javonetHandle.get("Cursol_1click");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  public java.lang.Boolean[] getWvVisible(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("WvVisible");
      if (res == null) return null;
      return (java.lang.Boolean[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setWvVisible(java.lang.Boolean[] param) {
    try {
      javonetHandle.set("WvVisible", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short[][] getData_A(Class<?> returnArrayType) {
    try {
      Object[][] res = javonetHandle.<NObject[][]>get("Data_A");
      if (res == null) return null;
      return (java.lang.Short[][])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setData_A(java.lang.Short[][] param) {
    try {
      javonetHandle.set("Data_A", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short[][] getData_D(Class<?> returnArrayType) {
    try {
      Object[][] res = javonetHandle.<NObject[][]>get("Data_D");
      if (res == null) return null;
      return (java.lang.Short[][])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setData_D(java.lang.Short[][] param) {
    try {
      javonetHandle.set("Data_D", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short[] getCursolVal(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("CursolVal");
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
  public void setCursolVal(java.lang.Short[] param) {
    try {
      javonetHandle.set("CursolVal", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short[] getAOffset(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("AOffset");
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
  public void setAOffset(java.lang.Short[] param) {
    try {
      javonetHandle.set("AOffset", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CustomGraph() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("cms2.CustomGraph");
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "ButtonAnlgOffset",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CustomGraph.ButtonAnlgOffsetEventHandler handler : _ButtonAnlgOffsetListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ButtonCSVsave",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CustomGraph.ButtonCSVsaveEventHandler handler : _ButtonCSVsaveListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CustomGraph(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GraphDraw() {
    try {
      javonetHandle.invoke("GraphDraw");
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

  private java.util.ArrayList<CustomGraph.ButtonAnlgOffsetEventHandler> _ButtonAnlgOffsetListeners =
      new java.util.ArrayList<CustomGraph.ButtonAnlgOffsetEventHandler>();

  public void addButtonAnlgOffset(CustomGraph.ButtonAnlgOffsetEventHandler toAdd) {
    _ButtonAnlgOffsetListeners.add(toAdd);
  }

  public void removeButtonAnlgOffset(CustomGraph.ButtonAnlgOffsetEventHandler toRemove) {
    _ButtonAnlgOffsetListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<CustomGraph.ButtonCSVsaveEventHandler> _ButtonCSVsaveListeners =
      new java.util.ArrayList<CustomGraph.ButtonCSVsaveEventHandler>();

  public void addButtonCSVsave(CustomGraph.ButtonCSVsaveEventHandler toAdd) {
    _ButtonCSVsaveListeners.add(toAdd);
  }

  public void removeButtonCSVsave(CustomGraph.ButtonCSVsaveEventHandler toRemove) {
    _ButtonCSVsaveListeners.remove(toRemove);
  }

  public interface ButtonAnlgOffsetEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, EventArgs e);
  }

  public interface ButtonCSVsaveEventHandler {
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
