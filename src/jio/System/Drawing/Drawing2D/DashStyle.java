package jio.System.Drawing.Drawing2D;

public enum DashStyle {
  Solid(0L),
  Dash(1L),
  Dot(2L),
  DashDot(3L),
  DashDotDot(4L),
  Custom(5L),
  ;
  private long numVal;

  DashStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
