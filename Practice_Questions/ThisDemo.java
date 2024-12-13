class ThisDemo{


    ThisDemo(){

        System.out.println("no agrs constructor");
    }

    ThisDemo(int a){
        
        System.out.println("Parameterised constructor");


    }
    public static void main(String[] args){

     ThisDemo td=new ThisDemo(10);
    
    }
}