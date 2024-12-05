class DigitsFrequency{

    public static void main(String[] args){

        int num=932935432;
        int dig=9;
        int count=0;
        while(num!=0){
            int a=num%10;
            if(a==dig){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}