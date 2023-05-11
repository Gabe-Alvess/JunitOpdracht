public class OddOrEven {

    public String isNumberOddOrEven(int number) {

        String numToString = Integer.toString(number);
        int index = numToString.length() - 1;

        char endOfNumber = numToString.charAt(index);

        String result = "";

        switch (endOfNumber) {
            case '0': case '2': case '4': case '6': case '8':
                result = "Even";
                break;
            case '1': case '3': case '5': case '7': case '9':
                result = "Odd";
        }

        return result;
    }
}
