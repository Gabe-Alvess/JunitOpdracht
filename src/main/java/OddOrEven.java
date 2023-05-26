public class OddOrEven {

    public String isNumberOddOrEven(int number) {

        String numToString = Integer.toString(number);
        int index = numToString.length() - 1;

        char endOfNumber = numToString.charAt(index);

        return switch (endOfNumber) {
            case '0', '2', '4', '6', '8' -> "Even";
            case '1', '3', '5', '7', '9' -> "Odd";
            default -> "";
        };
    }
}
