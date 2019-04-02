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

public class PictureBoxRotate extends PictureBox
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
  public void setDrawBackEnable(java.lang.Boolean Value) {
    try {
      javonetHandle.set("DrawBackEnable", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDrawBackEnable() {
    try {
      java.lang.Boolean res = javonetHandle.get("DrawBackEnable");
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
  public void setRotate(PictureBoxRotate.Rotate_State Value) {
    try {
      javonetHandle.set("Rotate", NEnum.fromJavaEnum(Value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PictureBoxRotate.Rotate_State getRotate() {
    try {
      Object res = javonetHandle.<NEnum>get("Rotate");
      if (res == null) return null;
      return PictureBoxRotate.Rotate_State.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setImageTop(Image Value) {
    try {
      javonetHandle.set("ImageTop", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Image getImageTop() {
    try {
      Object res = javonetHandle.<NObject>get("ImageTop");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setImageSub(Image Value) {
    try {
      javonetHandle.set("ImageSub", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Image getImageSub() {
    try {
      Object res = javonetHandle.<NObject>get("ImageSub");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setImageState(java.lang.Boolean Value) {
    try {
      javonetHandle.set("ImageState", Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getImageState() {
    try {
      java.lang.Boolean res = javonetHandle.get("ImageState");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public PictureBoxRotate() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("cms2.PictureBoxRotate");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PictureBoxRotate(NObject handle) {
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

  public enum Rotate_State {
    None(0L),
    Rotate90(1L),
    Rotate180(2L),
    Rotate270(3L),
    MirrorNone(4L),
    MirrorRotate90(5L),
    MirrorRotate180(6L),
    MirrorRotate270(7L),
    ;
    private long numVal;

    Rotate_State(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
