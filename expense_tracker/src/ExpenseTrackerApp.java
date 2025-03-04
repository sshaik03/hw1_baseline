import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 * The ExpenseTrackerApp class allows users to add/remove daily transactions.
 */
public class ExpenseTrackerApp {

    public static void main(String[] args) {

        // Create MVC components
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Serial");
        tableModel.addColumn("Amount");
        tableModel.addColumn("Category");
        tableModel.addColumn("Date");

        ExpenseTrackerView view = new ExpenseTrackerView(tableModel);

        // Initialize view
        view.setVisible(true);

        // Handle add transaction button clicks
        view.getAddTransactionBtn().addActionListener(e -> {
          try {
            // code that might throw NumberFormatException or IllegalArgumentException
            double amount = view.getAmountField(); // parseDouble can throw NumberFormatException
            String category = view.getCategoryField();
        
            InputValidation.validateAmount(amount);     // might throw IllegalArgumentException
            InputValidation.validateCategory(category); // might throw IllegalArgumentException
        
            Transaction t = new Transaction(amount, category);
            view.addTransaction(t);
        
        } catch (NumberFormatException ex) {
            // This catches non-numeric input in amountField
            JOptionPane.showMessageDialog(
                view,
                "Amount must be a valid number.",
                "Invalid Input",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (IllegalArgumentException ex) {
            // This catches invalid amounts (<=0 or >=1000) or invalid category
            JOptionPane.showMessageDialog(
                view,
                ex.getMessage(),
                "Invalid Input",
                JOptionPane.ERROR_MESSAGE
            );
        }
        
        });
    }
}
