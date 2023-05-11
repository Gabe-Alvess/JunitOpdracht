public class Palindrome {

    public String isWordAPalindrome(String word) {

        if (word == null) {
            return "Error! Null isn't allowed";
        }

        String formattedWord = word.trim().toLowerCase();

        if (formattedWord.isBlank() || formattedWord.length() < 2) {
            return "Error! Not a word";
        } else if (formattedWord.contains(" ")) {
            return "Error! Please enter a word not a sentence.";
        }

        String reversedWord = new StringBuilder(formattedWord).reverse().toString();

        return formattedWord.equals(reversedWord) ? "Yes" : "No";
    }
}
