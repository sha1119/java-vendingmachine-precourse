package validator;

public class InputNumberValidator {
    public static int validateInput(String userInput) {
        int inputValue = isNumber(userInput);
        isPositiveNumber(inputValue);
        return inputValue;
    }

    public static int isNumber(String userInput) {
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ExceptionMessage.ERROR_PHRASE + ExceptionMessage.ERROR_INPUT_NUMBER);
        }
    }
}
