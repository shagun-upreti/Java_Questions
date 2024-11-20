class MethodOverloading{

     void show(int a, int b){

        System.out.println("With two arguments");
     }

    void show(int a){

        System.out.println("With one argument");
    }
    public static void main(String[] args){

        MethodOverloading t= new MethodOverloading();
       
        t.show(10,20);
    }
}