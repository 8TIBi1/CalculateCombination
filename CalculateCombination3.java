import java.math.BigInteger;
import java.util.Scanner;

// 使用递归的方法用组合数递推公式计算
// C(n + 1, k) = C(n, k - 1) + C(n, k)

public class CalculateCombination3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int N = input.nextInt();
        System.out.print("Please enter k: ");
        int K = input.nextInt();

        BigInteger result = calculateN1(N, K);
        System.out.println("C(" + N + ", " + K + ") = " + result);
    }

    public static BigInteger calculateN1(int n, int k) {
        if(k == 0 || n == k) {
            return BigInteger.valueOf(1);
        }
        if(k == 1) {
            return BigInteger.valueOf(n);
        }
        BigInteger value;
        value = calculateN1(n - 1, k - 1).add(calculateN1(n - 1, k));

        return value;
    }
}
