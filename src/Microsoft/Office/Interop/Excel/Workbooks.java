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
import jio.System.Collections.*;

public interface Workbooks extends IEnumerable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Workbook Open(
      java.lang.String Filename,
      Object UpdateLinks,
      Object ReadOnly,
      Object Format,
      Object Password,
      Object WriteResPassword,
      Object IgnoreReadOnlyRecommended,
      Object Origin,
      Object Delimiter,
      Object Editable,
      Object Notify,
      Object Converter,
      Object AddToMru,
      Object Local,
      Object CorruptLoad);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Workbook get_Default(Object Index);
}
