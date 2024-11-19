class IsPrime{

    public static void main(String[] args){

        int num=144;
        int count=0;
        for(int i=2;i<num/2;i++){
            
            if(num%i==0){
                count++;
                break;
            }
        }

        if(count>0){
            System.out.println("Is not a prime number");
        }
        else{
            System.out.println("Is a prime number");
        }
    }
}