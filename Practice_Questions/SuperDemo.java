class A{

    int a=10;
}
class SuperDemo extends A{

    int a=20;
    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args){
        SuperDemo ob= new SuperDemo();
        ob.show(30);
    }
}