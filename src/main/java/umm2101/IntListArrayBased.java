package umm2101;

public class IntListArrayBased implements IntegerList {
  private static final int MAX_LIST = 50;
  private int items[];
  private int numItems;
  
  public IntListArrayBased(){
    items = new int[MAX_LIST];
    numItems = 0;
  }
  
  public boolean isEmpty(){
    return (numItems == 0);
  }
  
  public int length(){
    return numItems;
  }
  
  public void insert(int location, int item) throws ListIndexOutOfBoundsException {
    if (numItems >= MAX_LIST) {
      // todo: part of step 5:
      // fix the code so that the message provides correct details about the problem
        throw new ListException("List exception on add");
    }
    if (location >= 1 && location <= numItems+1){
      for (int pos = numItems; pos >= location; pos--){
        items[translate(pos+1)] = items[translate(pos)];
      }
      items[translate(location)] = item;
      numItems++;
    } else {
      // todo: part of step 5:
      // fix the code so that the message provides correct details about the problem
        throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on insert");

    }
  }
  
  public void append(int item){
    // This adds an item to the end of a list
    insert(numItems + 1, item);
  }
  
  public int getItemAt(int location) 
    throws ListIndexOutOfBoundsException {
    // todo: part of step 4: this method doesn't work yet - you need to write this code
    // How can you access the item at the given location?
  
    // Someone might ask for an item at a location that does not exist
    // todo: part of step 5: be sure that the message for this exception 
    // provides correct details about the problem
    return 0;
  }

  public int remove(int location) 
    throws ListIndexOutOfBoundsException {
    // todo: part of step 4: this method doesn't work yet - you need to write this code
    // What needs to happen when you remove something from an array-based list?
    
    // Someone might ask to remove an item from a location that does not exist
    // todo: part of step 5: be sure that the message for this exception 
    // provides correct details about the problem
    return 0;
  }
  
  public void clear(){
    items = new int[MAX_LIST];
    numItems = 0;
  }
  
  private int translate(int position){
    return position - 1;
  }
  
  public String toString(){
    String s = "[";
    for (int i = 0; i<numItems; i++){
      s = s + items[i] + " ";
    }
    s += "]";
    return s;
  }
  
}
  
  





