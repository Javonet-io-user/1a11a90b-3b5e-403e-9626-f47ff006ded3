package Microsoft.Office.Interop.Excel;

public enum XlSaveAsAccessMode {
  xlNoChange(1L),
  xlShared(2L),
  xlExclusive(3L),
  ;
  private long numVal;

  XlSaveAsAccessMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
