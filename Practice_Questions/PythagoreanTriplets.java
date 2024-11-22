// import java.util.*;
// class PythagoreanTriplets{

//     public static void main(String[] args){
//         int a=5;
//         int b=3;
//         int c=4;
//         int x=(int) Math.pow(a,2);
//         int y=(int) Math.pow(b,2);
//         int z=(int) Math.pow(c,2);
//         if(x== (y+z)){
//             System.out.println("This is a pythagorean triplet");
//         }
//     }
// }

import java.util.*;
 class PythagoreanTriplets{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        if(max==a){
            boolean flag=((a*a)==(b*b)+(c*c));
            System.out.println(flag);
        }
        else if(max==b){
            boolean flag=((b*b)==(a*a)+(c*c));
            System.out.println(flag);
        }
        else{
            boolean flag=((c*c)==(a*a)+(b*b));
            System.out.println(flag);
        }
        
    }
 }