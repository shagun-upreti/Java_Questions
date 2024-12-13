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
// class ThisDemo{

//     void m1(ThisDemo hi){

//         System.out.println("method1");
//     }

//     void m2(){

//         m1(this);
//     }
//     public static void main(String[] args){

//         ThisDemo td=new ThisDemo();
//         td.m2();
//     }
// }






//------------------------this keyword can be used to pass as an argument in the constructor call--------------------

// class Test{

//     Test(ThisDemo a){

//         System.out.println("constructor call");
//     }
// }

// class ThisDemo{

//     void m1(){

//         Test t=new Test(this);

//     }
//     public static void main(String[] args){

//         ThisDemo td=new ThisDemo();
//         td.m1();
//     }
// }



//--------------------this keyword can be used to return the current class instance from the method-----------------
class ThisDemo{

    ThisDemo m1()
    {
        return this;
    }
    public static void main(String[] args){
        ThisDemo td=new ThisDemo();
      System.out.println( td.m1());
    }
}
