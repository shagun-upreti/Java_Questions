// class BaseToDecimal{

//     public static void main(String[] args){

//         String binaryNumber = "111001";
//         int decimalValue = Integer.parseInt(binaryNumber, 2);
//         System.out.println("Binary " + binaryNumber + " to Decimal is " + decimalValue);
//     }
// }
import java.util.Scanner;
class BaseToDecimal{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%10;
            n=n/10;
            rv+=dig*p;

            p=p*b;
        }
        System.out.println(rv);
    }
}