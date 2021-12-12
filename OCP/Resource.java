package ocp;

public interface Resource {
  public int findFreeSlot();

  public void markSlotBusy(int resourceId);

  public void markSlotFree(int resourceId);
}
