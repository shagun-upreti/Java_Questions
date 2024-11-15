// class Constructor{

//     Constructor(int a)
//     {
//         System.out.println("parameterized constructor");
//     }

//     public static void main(String[] args){
       
//         Constructor cs=new Constructor(10); 
//     }
// }

class Constructor{

    String name;
    int id;

    Constructor(String name, int id){
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args){

        Constructor c1=new Constructor("Shagun",10);
        Constructor c2=new Constructor("Manas",20);

        System.out.println("Constructor1 "+c1.name+" "+c1.id);
        System.out.println("Constructor2 "+c2.name+" "+c2.id);
    }
}