package Microsoft.Office.Interop.Excel;

public enum XlLineStyle {
  xlContinuous(1L),
  xlDashDot(4L),
  xlDashDotDot(5L),
  xlSlantDashDot(13L),
  xlLineStyleNone(-4142L),
  xlDouble(-4119L),
  xlDot(-4118L),
  xlDash(-4115L),
  ;
  private long numVal;

  XlLineStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
