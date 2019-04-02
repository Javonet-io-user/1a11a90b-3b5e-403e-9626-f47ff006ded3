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
import cms2.*;
import jio.System.*;

public class ChangeDateFormat {
  protected NObject javonetHandle;

  public ChangeDateFormat() {
    try {
      javonetHandle = Javonet.New("cms2.ChangeDateFormat");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ChangeDateFormat(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime ChangeDate(AtomicReference<java.lang.Integer> DateInteger) {
    try {
      Object res = javonetHandle.invoke("ChangeDate", new NRef(DateInteger));
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ChangeDateString(AtomicReference<java.lang.Integer> DateInteger) {
    try {
      java.lang.String res = javonetHandle.invoke("ChangeDateString", new NRef(DateInteger));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] ValidPeriodString(java.lang.Integer mode, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ValidPeriodString", mode);
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer[] ValidPeriodInteger(
      java.lang.String[] DateString, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ValidPeriodInteger", new Object[] {DateString});
      if (res == null) return null;
      return (java.lang.Integer[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime[] ValidPeriodDateTime(java.lang.String[] DateString, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ValidPeriodDateTime", new Object[] {DateString});
      if (res == null) return null;
      return (DateTime[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] ChangeStartEndDateString(
      AtomicReference<java.lang.String> DateString, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ChangeStartEndDateString", new NRef(DateString));
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer[] ChangeStartEndDateInteger(
      AtomicReference<java.lang.String> DateString, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ChangeStartEndDateInteger", new NRef(DateString));
      if (res == null) return null;
      return (java.lang.Integer[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime[] ChangeStartEndDateTime(
      AtomicReference<java.lang.String> DateString, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ChangeStartEndDateTime", new NRef(DateString));
      if (res == null) return null;
      return (DateTime[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Language_JP() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Language_JP");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String BlankDateString() {
    try {
      java.lang.String res = javonetHandle.invoke("BlankDateString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ChangeDateInteger(DateTime DateDateTime) {
    try {
      java.lang.Integer res = javonetHandle.invoke("ChangeDateInteger", DateDateTime);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
