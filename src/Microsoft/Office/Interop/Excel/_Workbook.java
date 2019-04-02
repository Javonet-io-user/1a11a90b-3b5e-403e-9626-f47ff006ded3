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

public interface _Workbook {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void SaveAs(
      Object Filename,
      Object FileFormat,
      Object Password,
      Object WriteResPassword,
      Object ReadOnlyRecommended,
      Object CreateBackup,
      XlSaveAsAccessMode AccessMode,
      Object ConflictResolution,
      Object AddToMru,
      Object TextCodepage,
      Object TextVisualLayout,
      Object Local);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSaved();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Sheets getWorksheets();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSaved(java.lang.Boolean RHS);
}
