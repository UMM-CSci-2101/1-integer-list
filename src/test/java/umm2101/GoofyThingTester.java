package umm2101;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GoofyThingTester {

  private static final Logger logger = Logger.getLogger(GoofyThingTester.class.getName());
  
  // This field is declared here so that I can give it a value in setUp and refer to it in tests.
  // Note that I am only checking for behavior that is promised in the interface IntegerList
  GoofyThing goof;
  
  // Something with the annotation @BeforeEach is run before each of the provided test methods.
  // In this case, I am thankful for having @BeforeEach because the only place I declare that I am 
  // going to use an IntListArrayBased is here. This will allow me to use this same set of tests to 
  // test IntListLinked or whatever we call our linked list version of IntegerList (since I refer to 
  // the list just as 'list').
  @BeforeEach
  public void setUp() {
    goof = new GoofyThing();
  }

  @Test
  @DisplayName("TestJump")
  public void testJump() {
      assertEquals("jumpjumpjump", goof.jump());

  }

  @Test
  public void testRollover() {
      String theClass = goof.getFavoriteClass();
      assertEquals("CSci 2101", theClass);
      assertEquals("CSci 2101CSci 2101", goof.rollOver());
  }

}