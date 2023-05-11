import java.util.Arrays;
public class MinNumArray {

    private final int[] numArray;

    public MinNumArray() {
        numArray = new int[] {50, 100, 200, 777, 5, 10};
    }

    public MinNumArray(int[] numArray) {
        this.numArray = numArray;
    }

    public int getSmallestNumber() {
        Arrays.sort(numArray);

        return numArray[0];
    }

}
