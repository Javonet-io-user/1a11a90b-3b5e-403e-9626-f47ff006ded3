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

public interface _Worksheet {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Paste(Object Destination, Object Link);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void PrintOut(
      Object From,
      Object To,
      Object Copies,
      Object Preview,
      Object ActivePrinter,
      Object PrintToFile,
      Object Collate,
      Object PrToFileName);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Range getCells();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public PageSetup getPageSetup();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Range getRange(Object Cell1, Object Cell2);
}
