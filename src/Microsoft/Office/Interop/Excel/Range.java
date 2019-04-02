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

public interface Range extends IEnumerable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Object Select();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object get_Default(Object RowIndex, Object ColumnIndex);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Borders getBorders();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object getValue(Object RangeValueDataType);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void set_Default(Object RowIndex, Object ColumnIndex, Object Param);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setValue(Object RangeValueDataType, Object Param);
}
