package ocp;

public class TimeResource implements Resource {

  @Override
  public int findFreeSlot() {
    return 0;
  }

  @Override
  public void markSlotBusy(int resourceId) {}

  @Override
  public void markSlotFree(int resourceId) {}
}
