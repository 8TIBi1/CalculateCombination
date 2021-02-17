import java.math.BigInteger;
import java.util.Scanner;

// 采用组合数公式：C(n, k) = n! / (k! * (n - k)!)
public class CalculateCombination1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int numberN = input.nextInt();
        System.out.print("Please enter k: ");
        int numberK = input.nextInt();
        BigInteger result = calculateN(numberN).divide(calculateN(numberK).multiply(calculateN(numberN - numberK)));
        System.out.println("C(n, k) = " + result);
    }

    public static BigInteger calculateN(int n) {
        if(n == 0 || n == 1) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(n).multiply(calculateN(n - 1));
    }
}
