class StringReverse {

    public static void main(String[] args){

        String str="shagun";
        //System.out.println("H\u2082O");
        StringBuilder s= new StringBuilder(str);
        s.reverse();
        String ss=s.toString();
        System.out.println(ss);
    }
}