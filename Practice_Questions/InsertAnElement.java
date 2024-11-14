class InsertAnElement{

    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int element= 13;
        int position= 3;
        int newArr[]= new int[arr.length+1];

        for(int i=0;i<position;i++){
            newArr[i]=arr[i];
        }

        newArr[position]= element;

        for(int i=position; i<arr.length;i++){
            newArr[i+1]=arr[i];
        }

        for(int i=0; i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}