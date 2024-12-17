// class A{

//     int a=10;
// }
// class SuperDemo extends A{

//     int a=20;
//     void show(int a){
//         System.out.println(a);
//         System.out.println(this.a);
//         System.out.println(super.a);
//     }

//     public static void main(String[] args){
//         SuperDemo ob= new SuperDemo();
//         ob.show(30);
//     }
// }

//----------------super keyword can be used to invoke immediate parent class method-------------------------

// class A{

//     void m(){

//         System.out.println("This is class A");
//     }
// }
// class SuperDemo extends A{

//     void m(){

//         System.out.println("This is class superdemo");
//     }

//     void show(){

//         m();
//         super.m();
//     }
//     public static void main (String[] args){
//         SuperDemo ob=new SuperDemo();
//         ob.show();
//     }
// }


//-----------------super() can be used to invoke immediate parent class constructor-------------

class A{

    A()
    {
      System.out.println("In class A");
    }
}
class SuperDemo extends A{

    
    SuperDemo(){

        super();
        System.out.println("In class SuperDemo");
    }
    public static void main(String[] args){
        SuperDemo ob=new SuperDemo();
    }
}


