interface I1{

    void show1();
}

interface I2{

    void show2();
}
class Interface implements I1{

    public void show1(){

        System.out.println("A");
    }

    public void show2(){

        System.out.println("B");

    }

    public static void main(String[] args){

        Interface i=new Interface();
        i.show1();
        i.show2();
    }


}