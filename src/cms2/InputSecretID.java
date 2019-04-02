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

public class InputSecretID extends Form
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
  public void setBasMasterID(java.lang.Short value) {
    try {
      javonetHandle.set("BasMasterID", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Short getBasMasterID() {
    try {
      java.lang.Short res = javonetHandle.get("BasMasterID");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBasMasterDataString(java.lang.String value) {
    try {
      javonetHandle.set("BasMasterDataString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getBasMasterDataString() {
    try {
      java.lang.String res = javonetHandle.get("BasMasterDataString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String[] getMstSecretNum(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("MstSecretNum");
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
  public void setMstSecretNum(java.lang.String[] param) {
    try {
      javonetHandle.set("MstSecretNum", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InputSecretID() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("cms2.InputSecretID");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InputSecretID(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
