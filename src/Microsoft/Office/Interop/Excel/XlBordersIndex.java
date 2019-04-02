package Microsoft.Office.Interop.Excel;

public enum XlBordersIndex {
  xlDiagonalDown(5L),
  xlDiagonalUp(6L),
  xlEdgeLeft(7L),
  xlEdgeTop(8L),
  xlEdgeBottom(9L),
  xlEdgeRight(10L),
  xlInsideVertical(11L),
  xlInsideHorizontal(12L),
  ;
  private long numVal;

  XlBordersIndex(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
