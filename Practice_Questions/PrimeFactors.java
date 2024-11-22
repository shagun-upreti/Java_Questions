class PrimeFactors{

    public static void main(String[] args){

        int num=1440;
        for(int i=2;i<=num;i++){
            while(num%i==0){
                num=num/i;
                System.out.println(i);
            }
             
        }
    }
}