package jio.System.Windows.Forms;

public enum PictureBoxSizeMode {
  Normal(0L),
  StretchImage(1L),
  AutoSize(2L),
  CenterImage(3L),
  Zoom(4L),
  ;
  private long numVal;

  PictureBoxSizeMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
