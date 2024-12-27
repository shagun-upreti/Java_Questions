
//--------------------Final variable----------------------

// class Final{

//     public static void main(String args[]){
//         final int i=10;
//         i=i+20;
//         System.out.println(i);
//     }
// }

//-----------------------Final Method----------------------------

class Demo{
 void display(){

        System.out.println("This is method 1");
        }
}

class Demo2 extends Demo{
    void display(){
        System.out.println("This is method 2");
    }
}


class Final{
    public static void main(String args[]){
    Demo2 ob=new Demo2();
    ob.display();
        

    }
}

