package umm2101;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class OurList<E> {
  private static final int MAX_LIST = 50;
  private ArrayList<E> items;
  private int numItems;
  private int position;
  
  public OurList(){
    items = new ArrayList<E>(MAX_LIST);
    numItems = 0;
    position = 0;
  }

  public void clear(){
    items = new ArrayList<E>(MAX_LIST);
    numItems = 0;
  }
  
  public boolean insert(E item) {
    items.add(position, item);
    numItems++;
    return true;
  }

  public boolean append(E item){
    // This adds an item to the end of a list
    items.add(numItems, item);
    numItems++;
    return true;
  }
  
  public E remove() 
    throws NoSuchElementException {
        if (numItems < position) {
            return items.remove(position);
        } else {
            throw new NoSuchElementException("There's not an element there");
        }
  }

  public void moveToStart() {
    position = 0;
    
  }

  public void moveToEnd() {
    position = numItems;

  }

  public void prev() {
    if (position != 0) {
      position = position - 1;
    }
    
  }

  public void next() {
    if (position != numItems) {
      position++;
    }
  }

  public int length(){
    return numItems;
  }

  public int currPos() {
    return position;
  }

  public boolean moveToPos(int pos) {
    if (pos > numItems || pos < 0) {
      return false;
    } else {
      position = pos;
      return true;
    }
  }

  public boolean isAtEnd() {
    if (position == numItems) {
      return true;
    }
    return false;
  }

  public E getValue() throws NoSuchElementException {
    if (position < numItems) {
      return items.get(position);
    } else {
      // Use this as an example for what to do for the "todo" where you are asked to throw an exception
      throw new NoSuchElementException("The current position is after the last item. There isn't an element here");
    }
  }

  public boolean isEmpty(){
    return (numItems == 0);
  }
  
  public String toString(){
    StringBuilder s = new StringBuilder("[");
    int position = currPos();
    for (int i = 0; i<numItems; i++){
      if (i==position) {
        s.append(" (" + items.get(i) + ")");
      } else {
        s.append(" " + items.get(i));
      }
    }
    s.append("]");
    return s.toString();
  }

  public static void main(String[] args) {
      OurList<Integer> mylist = new OurList<Integer>();
      System.out.println(mylist.items);
      System.out.println(mylist);
      OurList<String> mystrings = new OurList<String>();
      mystrings.insert("Hello");
      mystrings.insert("Goodbye");
      mystrings.insert("Tacocat");
      OurList<String> mystrings2 = new OurList<String>();
      mystrings2.insert("Help");
      mystrings2.insert("Good");
      mystrings2.insert("Tacodog");
      OurList<OurList<String>> superlist = new OurList<OurList<String>>();
      superlist.insert(mystrings);
      superlist.insert(mystrings2);
      System.out.println(superlist);

  }
  
}
  
  





