import java.math.BigInteger;
import java.util.Scanner;

// 使用递推的方法用杨辉三角形计算
// C(n + 1, k) = C(n, k - 1) + C(n, k)
public class CalculateCombination2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter n: ");
        int N = input.nextInt();

        System.out.print("Please enter k: ");
        int K = input.nextInt();

        BigInteger result = calculateN2(N, K);
        System.out.println("C(" + N + ", " + K + ") = " + result);
//        long result = calculateN2(N, K);
//        System.out.println("C(" + N + ", " + K + ") = " + result);
    }

//    public static long calculateN2(int n, int k) {
//
//        long[][] store = new long[n + 1][n + 1];
//
//        store[0][0] = 1;
//
//        for(int i = 1; i <= n; i++) {
//            for(int j = 0; j <= n; j++){
//                if(j == 0 || j == n) {
//                    store[i][j] = 1;
//                }
//                else {
//                    store[i][j] = store[i - 1][j - 1] + store[i - 1][j];
//                }
//            }
//        }
//        return store[n][k];
//    }

    public static BigInteger calculateN2(int n, int k) {

        BigInteger[][] store = new BigInteger[n + 1][n + 1];
        // 这里初始化很重要，long二维数组可以不用数组全部元素初始化一遍，但是BigInteger数组一定要初始化，
        // 否则会在后面计算的时候报错。
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                store[i][j] = BigInteger.valueOf(0);
            }
        }

        store[0][0] = BigInteger.valueOf(1);

        store[1][0] = store[1][1] = BigInteger.valueOf(1);

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= n; j++){
                if(j == 0 || j == n) {
                    store[i][j] = BigInteger.valueOf(1);
                }
                else {
                    if(store[i - 1][j] == null) {
                        System.out.println("(" + (i - 1) + ", " + j + ")");
                    }
                    store[i][j] = store[i - 1][j - 1].add(store[i - 1][j]);
                }
            }
        }
        return store[n][k];
    }
}
