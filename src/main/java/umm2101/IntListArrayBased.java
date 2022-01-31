package umm2101;

import java.util.NoSuchElementException;

public class IntListArrayBased implements IntegerList {
  private static final int MAX_LIST = 50;
  private int items[];
  private int numItems;
  private int position;
  
  public IntListArrayBased(){
    items = new int[MAX_LIST];
    numItems = 0;
    position = 0;
  }

  @Override
  public void clear(){
    items = new int[MAX_LIST];
    numItems = 0;
  }
  
  @Override
  public boolean insert(int item) {
    if (numItems >= MAX_LIST) {
      return false;

    } else {
      for (int i=numItems; i>position; i--) { // Shift elements up
        items[i] = items[i-1];                //   to make room                 
      }
      items[position] = item;
      numItems++;        // Increment list size
      return true;
    }
  }

  @Override
  public boolean append(int item){
    // This adds an item to the end of a list
    if (numItems >= MAX_LIST) {
      return false;
    }
    items[numItems] = item;
    numItems++;
    return true;
  }
  
  @Override
  public int remove() 
    throws NoSuchElementException {
    // This method doesn't work yet (even though it compiles). You need to write this code.
    // TODO 8: Write the code for remove()
    // What needs to happen when you remove something from an array-based list?
    
    // Someone might ask to remove an item when you are at the end of the list,
    // and you can't remove anything from there. Look at the method getValue() below for an example.
    // TODO 12: Create an appropriate message for this exception that provides correct details about the problem
    return 0;
  }

  @Override
  public void moveToStart() {
    position = 0;
    
  }

  @Override
  public void moveToEnd() {
    position = numItems;

  }

  @Override
  public void prev() {
    if (position != 0) {
      position = position - 1;
    }
    
  }

  @Override
  public void next() {
    if (position != numItems) {
      position++;
    }
  }

  @Override
  public int length(){
    return numItems;
  }

  @Override
  public int currPos() {
    return position;
  }

  @Override
  public boolean moveToPos(int pos) {
    if (pos > numItems || pos < 0) {
      return false;
    } else {
      position = pos;
      return true;
    }
  }

  @Override
  public boolean isAtEnd() {
    if (position == numItems) {
      return true;
    }
    return false;
  }

  @Override
  public int getValue() throws NoSuchElementException {
    if (position < numItems) {
      return items[position];
    } else {
      // Use this as an example for what to do for the "todo" where you are asked to throw an exception
      throw new NoSuchElementException("The current position is after the last item. There isn't an element here");
    }
  }

  @Override
  public boolean isEmpty(){
    return (numItems == 0);
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
  
  





