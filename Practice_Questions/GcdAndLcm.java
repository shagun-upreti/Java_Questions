class GcdAndLcm{

    public static void main(String[] args){

        int num1=24;
        int num2=36;
        int gcd=1;

        for(int i=1;i<=100;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }

        System.out.println(gcd);

        // for(int i=1;i<=100;i++){
        //     if((num1*i)==(num2*i)){
        //         System.out.println(num1*i);
        //     }
        // }

        int lcm=(num1*num2)/gcd;

        System.out.println(lcm);
    }
}