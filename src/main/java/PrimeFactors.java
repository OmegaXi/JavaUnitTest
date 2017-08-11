import java.util.Scanner;

/**
 * Created by PANYE on 8/11/2017.
 */
/*
        n = int(raw_input('Enter a number:'))
        print n,'=',
        while(n!=1):
        for i in range(2,n+1):
        if (n%i)==0:
        n/=i
        if(n == 1):
        print '%d'%(i)
        else:
        print '%d *'%(i),
        break
*/

public class PrimeFactors {
    public static void findPF(int num) {
        System.out.print(num + "=");
        while (num != 1) {
            for (int i = 2; i < num + 1; i++) {
                if (num % i == 0) {
                    num /= i;
                    if (num == 1) {
                        System.out.print(i);
                    } else {
                        System.out.print(i+"*");
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Input an number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findPF(num);
    }
}
