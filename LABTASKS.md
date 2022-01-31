LABTASKS.md

This document contains the instructions for this lab. There will be some items that you need to do just to make things work and try things out. I will indicate those items with a checkbox like this:
- [ ] What items will look like when you should *do* the item, but it's not exactly "graded"

Other tasks are graded elements and will be indicated as a TODO in your code and in these instructions. I will also say the number of points (which should match the rubric on Canvas). Those items will look more like this:
1. (500 points) What items will look like you should do the item for points - These items generally indicate what to do and where to do it. For example, you should locate the label for the first lab task // TODO #1 in this lab. Lines of code that begin with `// TODO` will show up in the "PROBLEMS" tab in the command area/terminal area of VS Code. When you are done with a `// TODO` you should change it to `// DONE` so that I can still find it easily for grading (only change TODO to DONE), but it will not show as a problem anymore.

Probably, once you have gotten to the point of reading these lab tasks (instructions), you will have your remote repository set up on GitHub (since we are using GitHub Classroom and you followed the assignment invitation to get started on the lab). The instructions will assume that you have a repository on GitHub that includes the appropriate starting code and structure.

The detailed learning outcomes for this lab are included in the [README](README.md), but the gist is that you will be using the interface defined in `IntegerList.java` to explore writing tests and writing code to make those tests pass in the context of a List data structure. In addition to learning a little bit about Java interfaces and JUnit testing, you will encounter, use, and test Java exceptions.

Remember, Java interfaces specify *what* methods a class promises to provide (what public methods must exist in a class that implements that interface), but not *how* those methods will do the work that they promise to do. This allows you to hide details of your implementation. For this lab, we are using an integer list where the values are stored in an array. The `IntegerList` interface does not specify that items will be stored in an array. How the data will be stored or accessed is not a promise made by the interface. In the subsequent lab, when we use a linked list structure to store our list data, the testing you develop here will still work because it will only rely on promises made in the `IntegerList` interface.

- [x] Create a repository with the starter code
- [ ] In GitKraken, clone the GitHub repository (this is your local copy, indicated in GitKraken by the little computer icon)
- [ ] In Visual Studio Code (VS Code), use the file menu to open the folder containing this cloned repository
- [ ] Try running the test in ListTester.java in VS Code by pressing the "test" button. The test should fail because it is incorrect - it claims that a new list should have one item when, actually, it should have 0 items. 
- [ ] Fix the bad test by making the list have an item (there is a line of code just waiting for you to "uncomment" it) and run again. Now, it should pass! 

Most of the time, you should be editing your code rather than editing the tests when you are working to make tests pass. In this case, I wanted to be sure each of you had the chance to see a failing test (to know what that looks like) and make it pass (to know what that looks like too).

There are several "TODO" items for the lab. The starter code in this repository includes two test files. Running the test files once you've written all the requested tests and having all the tests pass is a good indication that you have made your code work correctly.

Any logger.info statements show up in the debug console (another tab besides interactions or output in VS Code). You may add these logging statements in your tests so that you can see more information about your tests. This strategy can be helpful for debugging because it helps you verify what is going on. You can also use `System.out.println("message")`, but the logger does give you a little more information by default, such as when the test was run and which test method generated the logged information.

  1. (2 points) // TODO 1: Add a test for insert that asserts insert will return false (because the list is full)
   
  2. (2 points) // TODO 2: Add a test for insert that checks for insert to return true

  3. (2 points) // TODO 3: Add a test for insert that checks something else
  
  4. (2 points) // TODO 4: Write a test to get the first item in the list

  5. (2 points) // TODO 5: Write a test to get something that is not the first item in the list
  
  6. (4 points) // TODO 6: Write a test that verifies that a NoSuchItemException is called when calling getValue() from the end of the list

  7. (2 points) // TODO 7: Write a test that removes the first item in the list and checks that its value is what you expect
  // (The method for `remove()` is not working. Do "todo 8" next so that this test will pass.)
  
  8. (4 points) // TODO 8: Write the code for `remove()`

  9. (2 points) // TODO 9: Write a test that removes an item in the list and checks that its value is what you expect (not first)
  
  10. (2 points) // TODO 10: Write a test for removing all the items (clear)

  11. (3 points) // TODO 11: write a test that triggers the NoSuchElementException is thrown when calling remove() (Figure out when that exception should be thrown. Check that it is thrown (which is isn't, so that test will fail)). Do "todo 12" to write the code that throws the exception.
  
  12. (3 points) // TODO 12: Create an appropriate message for the exception thrown by `remove()` that provides correct details about the problem.

