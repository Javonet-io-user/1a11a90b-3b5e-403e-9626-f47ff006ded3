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

public interface Border {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object getLineStyle();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object getWeight();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setLineStyle(Object Param);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setWeight(Object Param);
}
