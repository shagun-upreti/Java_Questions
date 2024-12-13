// class ThisDemo{          --------------------------this() keyword can invoke current class constructors----------------------


//     ThisDemo(){

//         System.out.println("no agrs constructor");
//     }

//     ThisDemo(int a){
        
//         System.out.println("Parameterised constructor");


//     }
//     public static void main(String[] args){

//      ThisDemo td1=new ThisDemo();
//      ThisDemo tf2=new ThisDemo(10);
     
    
//     }
// }


//-------------------------this() keyword can be used to pass as an argument in the method call------------------------------
class ThisDemo{

    void m1(ThisDemo hi){

        System.out.println("method1");
    }

    void m2(){

        m1(this);
    }
    public static void main(String[] args){

        ThisDemo td=new ThisDemo();
        td.m2();
    }
}