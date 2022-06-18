package lang.print.gaps.task6;
import java.lang.Math;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int rounded = (int) Math.round(numberToBeRounded);
        System.out.println(rounded);
    }

    public static void main(String[] args) {
        FloatTypeCasting roundedNumber = new FloatTypeCasting();

        roundedNumber.roundNumber(3.6f);
    }
}
