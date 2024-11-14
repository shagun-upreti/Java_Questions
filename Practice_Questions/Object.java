class Object{
    
    String color;
    int age;
    void initObj(String c, int a){
        color=c;
        age=a;
    }
    void display(){
        System.out.println(color+" "+age);
    }
    public static void main(String[] args){
        Object buzo=new Object();
       buzo.initObj("black", 20);
       buzo.display();

       // System.out.println(buzo.color+" "+buzo.age);
    }
}