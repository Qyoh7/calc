import java.util.ArrayList;
import java.util.Scanner;

public class IntegralByTrapazoids
{
    //Function nderiv = new Function("nderiv", );

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double yVals[] = {16, 26, 30, 34, 37, 36, 32, 25};
        double integral = 0;

        for (int i = 0; i < yVals.length - 1; i++)
        {
            integral += (1.0/2.0) * 4 * (yVals[i] + yVals[i + 1]);
        }

        for (double val : yVals)
        {
            System.out.println(val);
        }

        System.out.print("Integral: ");
        System.out.println(integral);
        input.close();
    }
    public static double evalEq(double x)
    {
        return 10 - Math.pow(2, x);
    }
}
