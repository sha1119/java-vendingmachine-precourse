package validator;

public class InputNumberValidator {
    public static int validateInput(String userInput) {
        int inputValue = isNumber(userInput);
        isPositiveNumber(inputValue);
        isMultiplicationOfTen(inputValue);
        return inputValue;
    }

    public static int isNumber(String userInput) {
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ExceptionMessage.ERROR_PHRASE + ExceptionMessage.ERROR_INPUT_NUMBER);
        }
    }

    public static void isPositiveNumber(int inputValue) {
        if (inputValue < 1) {
            throw new IllegalArgumentException(ExceptionMessage.ERROR_PHRASE + ExceptionMessage.ERROR_INPUT_POSITIVE_NUMBER);
        }
    }

    public static void isMultiplicationOfTen(int inputValue) {
        if (inputValue % 10 != 0) {
            throw new IllegalArgumentException(ExceptionMessage.ERROR_PHRASE + ExceptionMessage.ERROR_INPUT_MULTIPLICATION_OF_TEN);
        }
    }

}
