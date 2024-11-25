abstract class Abstraction{
    
    int t;
    abstract void start();

}
 class Car extends Abstraction{

    void start(){
        System.out.println("start the car");
    }
 }

 class Bus extends Abstraction{
    
    void start(){
        System.out.println("start the bus");
    }

    public static void main(String[] args){
        Car c=new Car();
        c.start();

        Bus b=new Bus();
        b.start();
    }
 }