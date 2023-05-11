public class WordReverser {

    public String reverseWord(String word) {

        StringBuilder sb = new StringBuilder(word).reverse();

        return sb.toString();
    }
}
