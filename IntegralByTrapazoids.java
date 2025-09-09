import java.util.ArrayList;
import java.util.Scanner;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class IntegralByTrapazoids
{
    //Function nderiv = new Function("nderiv", );

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> yVals = new ArrayList<Double>();
        double integral = 0;

        System.out.println("Enter trapazoid interval");
        double interval = input.nextDouble();
        System.out.println("Enter range start");
        double start = input.nextDouble();
        System.out.println("Enter range end");
        double end = input.nextDouble();

        input.nextLine();
        System.out.println("Enter expression");
        String expr = input.nextLine();

        Expression e = new ExpressionBuilder(expr)
            .variable("x")
            .build();

        for (double i = start; i <= end; i += interval)
        {
            e.setVariable("x", i);
            yVals.add(e.evaluate());
        }

        for (int i = 0; i < yVals.size() - 1; i++)
        {
            integral += (1.0/2.0) * interval * (yVals.get(i) + yVals.get(i + 1));
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
