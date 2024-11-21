class MethodOverriding{

    void show(int a, String b){

        System.out.println("Cat");
    }
 
}

class Test4 extends MethodOverriding{
     
    void show(int a, String b){

        System.out.println("Dog");
    }
    public static void main(String[] args){

       // MethodOverriding mr= new MethodOverriding();
       // mr.show(10,"tt");

        Test4 t=new Test4();
        t.show(20,"tt");

        MethodOverriding mr= new MethodOverriding();
        mr.show(10,"tt");
    }
}
    
   
