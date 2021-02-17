import java.util.Scanner;

// 递归编程解决汉诺塔问题。
// 一篇比较好的博客参考地址：https://www.cnblogs.com/starry-skys/p/12555829.html
/*
* 汉诺塔问题的递归思路，其实把整个问题分解成三个步骤来做的。
* 即：把除最后一个disk(第n个)外的(n - 1)个disk通过peg3移动到peg2上，
*    再把未移动的第n个disk直接移动到peg3上。
*    接下来，再把在peg2上的(n - 1)个disk通过peg1，移动到peg3上。
*    至此，任务完成。
*
*    其中的关键点，就是只有在只剩下一个disk时，那个disk才是可以直接移动的。其他的(n - 1)个disk，
*    需要通过不断的递归分解来实现移动。
 */
public class TowerOfHanoi {
    public static void main(String[] args) {

        System.out.println("Please enter the number of disks: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        String peg1 = "peg1", peg2 = "peg2", peg3 = "peg3";
        Hanoi(N, peg1, peg2, peg3);
    }

    public static void Hanoi(int n, String peg1, String peg2, String peg3) {
        if(n == 1) {
            move(n, peg1, peg3);
        }
        else {
            Hanoi(n - 1, peg1, peg3, peg2);

            move(n, peg1, peg3);

            Hanoi(n - 1, peg2, peg1, peg3)  ;
        }
    }

    public static void move(int n, String origin, String destination) {
        System.out.println("把第" + n + "个盘子从" + origin + "移动到" + destination);
    }
}
