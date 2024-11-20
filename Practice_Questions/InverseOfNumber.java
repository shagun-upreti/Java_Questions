import java.util.Scanner;
class InverseOfNumber{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp = n;

        int inv=0;
        int op=1;
        while(temp!=0){
            int od = temp%10;
            int id = op;
            int ip = od;

            inv = inv + (id * ((int)Math.pow(10, (ip -1))));

            temp = temp/10;
            op++;
        }
        System.out.println(inv);
    }
}