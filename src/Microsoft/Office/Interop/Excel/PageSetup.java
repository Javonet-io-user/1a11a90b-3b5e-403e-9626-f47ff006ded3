package Microsoft.Office.Interop.Excel;

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
import Microsoft.Office.Interop.Excel.*;
import jio.System.*;

public interface PageSetup {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object getFitToPagesTall();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object getFitToPagesWide();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPrintArea();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object getZoom();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setFitToPagesTall(Object Param);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setFitToPagesWide(Object Param);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setPrintArea(java.lang.String Param);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setZoom(Object Param);
}
