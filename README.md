
# AWS class with Test Driven Development (TDD)
**Worke done without commits to GitHub will not be graded.**

Try to *check* the *checkboxes* as you go, and commit changes to the Readme.md as well.

## Part 1
There are a few tests that are not finished. And so, you will have a few tasks here.
You will make frequent commits:
* Create one test, and make sure it fails
* Commit to GitHub

$Created new test method as testRemoveAgain() which removes the values from an index and replaces with the values in the next index.And the last index value replaced with the Integer.MINVALUE

$ Created new failed test method testSumToPlace() that calculates the sum of elements upto the mentioned position in the list and also implemented new method sumToPlace() and committed to git using git commands

* Write your code to pass the test
* Commit to GitHub

$Modified the sumToPlace() method in AWS.java to pass the tests mentioned in the testSumToPlace() in AWSTest.java and commited to git using git commands

$Implemented the unfinished tests.
## Part 2
* [ ] Create a GitHub action to run your tests from Part 1

$Created github actions using Java with Maven and built the project as Maven Project. Created a pom.xml file which has tags of properties, build plugins, dependencies. Also wrote an yml file which has the actions related to run command which executes the tests in the AWSTest file

## Part 3 
* [ ] You will use the TDD technique for this part, remember to create a test before you implement the method; commit to GitHub every working change you make
* [ ] Create a method **removeBiggerThan(int threshold)** the AWS class that will remove all values bigger than a **threshold** that you send and return the number of removed values; use FILLER_VALUE to replace removed values
* [ ] Create unit tests for **removeBiggerThan(int threshold)**

$ Created method removeBiggerThan and also written the unit test cases through the TDD technique

* [ ] Create a method **stepMultiplier()** in the AWS class that will multiply all values less than 10 by 2, and all values that are less than 20 and bigger than 10 by 4, and all values that are less than 100 and bigger than 20 by 100;
* [ ] Create a unit tests for **stepMultiplier()**

$Created stepMultiplier method and also wrote the unit test cases through the TDD technique
