# hw1- Manual Review

The homework will be based on this project named "Expense Tracker",where users will be able to add/remove daily transaction. 

## How to build and test (from Terminal):
1. Make sure that you have Apache Ant installed. Run ```ant``` in the root directory, which contains the build.xml build file.

2. Run ```ant document``` to generate the jdoc folder. In that folder, open the index.html file.

3. Run ```ant compile``` to generate the class files. Compiled classes will be in the bin directory.

4. Run ```ant test``` to compile all unit tests and run them.

## How to run (from Terminal):
After building the project (i.e., running ant), run: ```java -cp bin ExpenseTrackerApp```

## How to clean up (from Terminal):
Run ```ant clean``` to clean the project (i.e., delete all generated files).

## Code Modification

Create a file named ```InputValidation.java```  to validate the ```amount``` and ```category``` field of this app. Some hints are as follows:
1. The ```amount``` should be greater than 0 and less than 1000. 
2. It should be a valid number. 
3. The ```category``` should be a valid string input from the following list: "food", "travel", "bills", "entertainment", "other" .
4. You should display error messages on the GUI and not accept the invalid input. . You should throw an appropriate exception. 
5. Update the ExpenseTrackerApp.java with the input validation steps for adding transaction.

## Manual Review
Here are some examples of satisfying ```non-functional`` requirements:
1. Understandability
• External documentation (such as a README file) improves program understanding. This app’s
README file helps users and developers by providing the build instructions.


Here are some examples of violating ```non-functional``` requirements:
1.  Modularity
• The app does not apply the MVC architecture pattern.
• The app should declare the following packages and their classes: model, view, controller. 

## Understandibility
For the understandability section, we will be inspecting your git log. You should include either the .git folder or else a gitLog.(pdf | txt).

## Supported Features that I added

1. **Add Transactions**  
   - Enter an `amount` (e.g., `50.0`) and `category` (e.g., `food`, `travel`, `bills`, etc.).
   - Click **Add Transaction** to record the expense in the table.

2. **Display Transactions**  
   - A table lists each transaction’s serial number, amount, category, and timestamp.
   - Automatically updates whenever a new transaction is added.

3. **Calculate Total**  
   - The bottom row of the table displays the total of all transaction amounts.

4. **Basic Input Validation** (to be implemented or already implemented, if you’ve done so)  
   - Ensures the `amount` is valid (e.g., > 0 and < 1000).
   - Ensures the `category` is one of the recognized options.
