class DecimalToBase{

    public static void main(String[] args){

        int num=57;
        StringBuilder s= new StringBuilder();
        while(num!=0){
            int n=num%2;
            s.append(n);
            num=num/2;
        }
        System.out.print(s.reverse().toString());
    }
}