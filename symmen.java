
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ANU
 */
public class symmen {
    public static void main(String[] args) throws IOException {
           Scanner sc=new Scanner(System.in);  
           BigInteger n,k,m;
           int T = sc.nextInt();
           for(;T!=0;T--){
               n= new BigInteger(sc.next());
               k= new BigInteger(sc.next());
               m= new BigInteger(sc.next());
               
               System.out.println(give(n,k,m));
           }
    }
    public static BigInteger give(BigInteger n,BigInteger k,BigInteger m){
//        int bill = k*(n*(n+1)/2)*(n*(n+1)/2);
        BigInteger bill = k.multiply((n.multiply(n.add(BigInteger.ONE)).divide(new BigInteger("2"))).pow(2));
//        int give = bill-m;
        BigInteger give = bill.subtract(m);
//        return give <= 0 ? 0 : give;
        if(give.compareTo(BigInteger.ZERO) == -1)
            return BigInteger.ZERO;
        return give;
    }
}
