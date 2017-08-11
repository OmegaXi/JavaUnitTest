import java.util.Scanner;

/**
 * Created by PANYE on 8/11/2017.
 */
public class GCD {
    public static int calGCD(int x, int y) {
        return (x == 0) ? y : calGCD(y % x, x);
    }

    public static void main(String[] args) {
        int n, a, b, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cases Num：");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Num a：");
            a = sc.nextInt();
            System.out.print("Num b：");
            b = sc.nextInt();
            k = calGCD(a, b);
            System.out.println("GCD = " + k);
        }
    }
}
