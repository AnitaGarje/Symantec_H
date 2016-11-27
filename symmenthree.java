
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANU
 */
public class symmenthree {
//    public static int[] array = {4,7,44,47,74,77,444};
    public ArrayList<BigInteger> array;

    public symmenthree() {
        array = new ArrayList<>();
        String str ="";
        for (int n = 0; n < 10; n++) {
            for (int i = 0;; i++) {
                str = Integer.toBinaryString(i);
                while(str.length() <= n)
                    str = "0" + str;
                if(str.length()-1 > n)
                    break;
                str = str.replace('0', '4').replace('1', '7');
                array.add(new BigInteger(str));
            }
        }        
    }

    public int getUpper(BigInteger i){
        int k=0;
//        while(array[k]<=i)
//            k++;
        while(array.get(k).compareTo(i) == -1 || array.get(k).compareTo(i) == 0){
            k++;
        }
        return k;
        
    }

//        public static int lower(int i){
//        int k=0;
//        while(array[k]<i-1)
//            k++;
//        return k;
//    }
    public int getLower(BigInteger i){
        int k=0;
        while(array.get(k).compareTo(i.subtract(BigInteger.ONE)) == -1 || array.get(k).compareTo(i.subtract(BigInteger.ONE)) == 0){
            k++;
        }
        return k;
        
    }
    
    public static void main(String[] args) {
        symmenthree obj = new symmenthree();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BigInteger l,r;
        int diff;
        
        for (;T!=0;T--){
//            l = sc.nextInt();
            l = new BigInteger(sc.next());
//            r = sc.nextInt();
            r = new BigInteger(sc.next());
//            diff = upper(r)- lower(l);
            diff = obj.getUpper(r) - obj.getLower(l);
            
            System.out.println(diff);
            
//            System.out.println(l + " lower : "+obj.getLower(l));
//            System.out.println(r + " upper : "+obj.getUpper(r));

        }
    }
    
//    public static int upper(int i){
//        int k=0;
//        while(array[k]<=i)
//            k++;
//        return k;
//    }
//
//    public static int lower(int i){
//        int k=0;
//        while(array[k]<i-1)
//            k++;
//        return k;
//    }

}
