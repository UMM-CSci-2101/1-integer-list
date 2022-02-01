package umm2101;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * This class contains Java unit tests (JUnit tests). Methods with the annotation @Test
 * will be called when running the test with JUnit (unless there is some other indication
 * that the test should not be run, such as using the annotation @Disabled).
 */
public class IntListTester {

  private static final Logger logger = Logger.getLogger(IntListTester.class.getName());
  
  // This field is declared here so that I can give it a value in setUp and refer to it in tests.
  // Note that I am only checking for behavior that is promised in the interface IntegerList
  IntegerList list;
  
  // Something with the annotation @BeforeEach is run before each of the provided test methods.
  // In this case, I am thankful for having @BeforeEach because the only place I declare that I am 
  // going to use an IntListArrayBased is here. This will allow me to use this same set of tests to 
  // test IntListLinked or whatever we call our linked list version of IntegerList (since I refer to 
  // the list just as 'list').
  @BeforeEach
  public void setUp() {
    list = new IntListArrayBased();
  }

  @Test
  @DisplayName("New lists are empty")
  public void testEmptyOnCreate() {
    System.out.println("-----Begin testEmptyOnCreate()-----");
    logger.info("The list has no items: " + list.toString());
    // when you create a list, it should be empty
    assertTrue(list.isEmpty());
  }
  
  @Test
  @DisplayName("Insert at current position")
  public void testInsertMethod() {
    System.out.println("-----Begin testInsertMethod()-----");
    // Using the logger
    logger.info("There should not be anything in the new list:" + list);

    // Check the assertion that the list has nothing
    assertEquals(0, list.length());
    // add 20 as the first item in the list (add to an empty list)
    list.insert(20);
    // verify that the list has exactly one item
    assertEquals(1, list.length());
    // Check the assertion that the item is, indeed, 20
    assertEquals(20, list.getValue());
    
    // add to the end of a non-empty list
    list.append(30);
    logger.info("After adding 30 to the end, the list is now:" + list);
    list.moveToPos(1);
    assertEquals(30, list.getValue());

  }
  
  // TODO 1: Add a test for insert that asserts insert will return false (because the list is full)
   
  // TODO 2: Add a test for insert that checks for insert to return true

  // TODO 3: Add a test for insert that checks something else
  
  
  @Test
  @DisplayName("Get the value at the current position")
  public void testGet() {  
    System.out.println("-----Begin testGet()-----");
    list.insert(20);
    // verify that the list has exactly one item
    assertEquals(1, list.length());
    // Check the assertion that the item is, indeed, 20
    assertEquals(20, list.getValue());
    logger.info("The list has length: " + list.length() + ". The first value is: " + list.getValue() + ". " + "The list: " + list);
  }
  
  // TODO 4: Write a test to get the first item in the list

  // TODO 5: Write a test to get something that is not the first item in the list
  
  // TODO 6: Write a test that verifies that a NoSuchItemException is called when calling getValue() from the end of the list

  
  @Test
  // @Disabled
  @DisplayName("Remove from current position")
  public void testRemove() {
    System.out.println("-----Begin testRemove()-----");

    // add one item
    list.insert(50);
    
    // size is one, 
    assertEquals(1, list.length());

    // add 49 other values
    for (int i = 49; i>0; i--) {
      list.insert(i);
    }
    logger.info("The list, at position 0: " + list.toString());
    assertEquals(50, list.length());

    list.moveToPos(9);
    logger.info("The list, at position 9: " + list);
    // we are looking at 10 (location 9, since it uses 0-based indexing)
    // removing the 10th item (location 9) should remove 10
    assertEquals(10, list.getValue());
    int val = list.remove();
    // We expect this test to fail until remove is implemented properly
    // You can use the @Disabled annotation (commented out above) 
    // to skip this test until you want to deal with it
    assertEquals(10, val);
    assertEquals(11, list.getValue());
    assertEquals(49, list.length());
    logger.info("The list after removing the 10: " + list);
    
    // add a 50th item (in position 49)
    list.moveToPos(49);
    list.insert(66);
    assertEquals(66, list.getValue());
  }

  // TODO 7: Write a test that removes the first item in the list and checks that its value is what you expect
  // (The method for remove() is not working. Do "todo 8" next so that this test will pass.)
  
  // TODO 9: Write a test that removes an item in the list and checks that its value is what you expect (not first)
  
  // TODO 10: Write a test for removing all the items (clear)

  // TODO 11: write a test that triggers the NoSuchElementException is thrown when calling remove()
  // (Figure out when that exception should be thrown. Check that it is thrown (which is isn't, so that test will fail).)
  // Do "todo 12" to write the code that throws the exception.
  
}
