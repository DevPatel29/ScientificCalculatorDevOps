import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;


public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double SquareRoot(double value) {
        if(value < 0) {
            System.out.println("Invalid Input: Negative number");
            return  -1;
        }
        else {
            double answer;
            try {
                answer = Math.sqrt(value);
            } catch (Exception e) {
                System.out.println("SquareRoot error");
                return -1;
            }

            System.out.println("Answer : " + answer);
            logger.info("RESULT - SquareRoot of " + value + " = " + answer);
            return answer;
        }
    }

    public static double Factorial(double value) {
        if(value < 0) return -1;

        double ans = 1;
        for(int i = 1; i <= value; ++i) {
            ans = ans * i;
        }
        logger.info("RESULT - Factorial of " + value + " = " + ans);
        return  ans;
    }

    public static double NaturalLog(double value) {
        double ans = 0;

        try {
            ans = Math.log(value);
        } catch (ArithmeticException  e) {
            System.out.println("Natural log error: "+ e);
        }

        logger.info("RESULT - NaturalLog of " + value + " = " + ans);
        return ans;
    }

    public static double Power(double base, double power) {
        double ans = (double)Math.pow(base, power);
        logger.info("RESULT - Power of " + base + "^" + power +  " = " + ans);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scientific Calculator DevOps");
        System.out.println("################################################################## ");

        boolean condition = true;
        while(condition) {
            System.out.println("\nPlease Choose operation to perform");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural log");
            System.out.println("4. Power function");
            System.out.println("5. Exit");

            int selected;

            try {
                selected = sc.nextInt();
            } catch (InputMismatchException exp) {
                System.out.println("Invalid option selected: " + exp);
                return;
            }

            int c;

            if(selected == 5) {
                condition = false;
                System.out.println("\nThank you!!\n");
            }
            else{
                System.out.print("Input value : ");
                double value;

                try {
                    value = sc.nextDouble();
                } catch (InputMismatchException exp){
                    System.out.println("Invalid value input: " + exp);
                    return;
                }

                switch (selected) {
                    case 1:
                        double ans = SquareRoot(value);
                        if(ans == -1) return;
                        break;
                    case 2:
                        if(value < 0) {
                            System.out.println("Invalid input: Negative number");
                            return;
                        }
                        else {
                            double res = Factorial(value);
                            System.out.println("Answer : " + res);
                        }
                        break;
                    case 3:
                        double res1;
                        if(value < 0) {
                            System.out.println("Invalid input: Negative number");
                            return;
                        } else {
                            res1 = NaturalLog(value);
                            System.out.println("Answer : " + res1);
                        }
                        break;
                    case 4:
                        System.out.print("Enter power : ");
                        double pow = sc.nextDouble();

                        if(pow < 0) {
                            System.out.println("Invalid input: Negative power");
                            return;
                        } else {
                            double res2 = Power(value, pow);
                            System.out.println("Answer : " + res2);
                        }
                        break;
                    default:
                        System.out.println("Not a valid option");
                        return;
                }

//                System.out.print("\n\nPlease Select the operation!!!\n1. Continue, \n2. Exit\n");
//                c = sc.nextInt();
//                System.out.println();
//                if(c == 2) {
//                    System.out.println("Thank you!!\n");
//                    condition = false;
//                }
            }
        }
    }
}
