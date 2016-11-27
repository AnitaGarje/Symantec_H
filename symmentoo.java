
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
 * @author SHRI
 */
public class symmentoo {

    public ArrayList<BigInteger> array;

    public void out(){
        int length = array.size();
        for (int i = 0; i < length; i++) {
            System.out.println(i + " " + array.get(i).toString());
        }
    }    
    
    public symmentoo() {
        array = new ArrayList<>();
        String str ="";
        for (int n = 0; n < 3; n++) {
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
    
    public static void main(String[] args) {
        symmentoo sy = new symmentoo();
        sy.out();
//        Scanner sc= new Scanner(System.in);
//        for(int i=0;i<100;i++){
//            System.out.print(isLuckey(i)==true ? i : "");
//        }
//        System.out.println(isLuckey(777777)==true ? "true":"false");
//        String str ="";
//        for (int n = 0; n < 18; n++) {
//            for (int i = 0;; i++) {
//                str = Integer.toBinaryString(i);
//                while(str.length() <= n)
//                    str = "0" + str;
//                if(str.length()-1 > n)
//                    break;
//                str = str.replace('0', '4').replace('1', '7');
//                System.out.print(str + ',');
//
//            }            
////            System.out.println("");
//        }
//        System.out.println(Integer.toBinaryString(262143));
//        BigInteger i= BigInteger.ZERO;
//        while(i.compareTo(new BigInteger("1000000000000000000")) == -1){
//            if(isLuckey(i))
//                System.out.print(i+",");
//            i= i.add(BigInteger.ONE);
//        }
        
    }
    public static String print(int bits,int i)
    {
        String str;
        str = Integer.toBinaryString(i);
        while(str.length() < bits){
            str += "0";
        }
        str = str.replace('0', '4').replace('1', '7');
        return str;
        
    }
    
    public static boolean isLuckey(int i){
        String str = i+"";
        for(int I=0;I<10;I++){
            if(I==4 || I==7)
                continue;
            if(str.contains(I+"")){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isLuckey(BigInteger i){
        String str = i.toString();
        for(int I=0;I<10;I++){
            if(I==4 || I==7)
                continue;
            if(str.contains(I+"")){
                return false;
            }
        }
        return true;
    }
}
