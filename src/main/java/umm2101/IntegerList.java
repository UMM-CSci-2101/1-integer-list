package umm2101;

public interface IntegerList {
  public boolean isEmpty();
  public int length();
  public void insert(int location, int item)
    throws ListIndexOutOfBoundsException,
    ListException;
  public void append(int item);
  public int getItemAt(int location)
  throws ListIndexOutOfBoundsException;
  public int remove(int location)
    throws ListIndexOutOfBoundsException;
  public void clear();

}
