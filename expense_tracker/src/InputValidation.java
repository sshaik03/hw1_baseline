import java.util.Arrays;
import java.util.List;

public class InputValidation {

    // A list of valid categories
    private static final List<String> VALID_CATEGORIES = Arrays.asList(
        "food", "travel", "bills", "entertainment", "other"
    );

    /**
     * Validates the amount to ensure it is > 0 and < 1000.
     * 
     * @param amount The transaction amount
     * @throws IllegalArgumentException if the amount is invalid
     */
    public static void validateAmount(double amount) {
        if (amount <= 0 || amount >= 1000) {
            throw new IllegalArgumentException("Amount must be greater than 0 and less than 1000.");
        }
    }

    /**
     * Validates the category to ensure it is one of the allowed options.
     * 
     * @param category The transaction category
     * @throws IllegalArgumentException if the category is invalid
     */
    public static void validateCategory(String category) {
        // Convert to lowercase and trim to allow case-insensitive matching (optional)
        String normalized = category.toLowerCase().trim();
        if (!VALID_CATEGORIES.contains(normalized)) {
            throw new IllegalArgumentException(
                "Category must be one of: food, travel, bills, entertainment, or other."
            );
        }
    }
}
