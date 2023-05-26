import java.util.Arrays;
public class MinNumArray {

    public int getSmallestNumber(int[] numArray) {
        Arrays.sort(numArray);

        return numArray[0];
    }

}
