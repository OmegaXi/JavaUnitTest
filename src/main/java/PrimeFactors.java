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
    public String findPrimeFactors(int num) {
        String result = String.valueOf(num);
        result += "=";
        while (num != 1) {
            for (int i = 2; i < num + 1; i++) {
                if (num % i == 0) {
                    num /= i;
                    if (num == 1) {
                        result += String.valueOf(i);
                    } else {
                        result += String.valueOf(i);
                        result += "*";
                        break;
                    }
                }
            }
        }
        return result;
    }
}

