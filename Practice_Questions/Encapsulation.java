class Company{

    private int com_id;
    public void setComid(int cid){
        com_id=cid;
    }
    public int getComid()
{
    return com_id;
    }
}
class Encapsulation{

    public static void main(String[] args){
        Company e=new Company();
        e.setComid(101);
        System.out.println(e.getComid());
    }
}