class DeleteAnElement{

    public static void main(String[] args){

        int arr[]={1, 2, 13, 3, 4, 5};
        int position= 2;

        int newArr[]= new int[arr.length-1];

        for(int i=0;i<position;i++){
            newArr[i]=arr[i];
        }

        for(int i=position+1; i<arr.length;i++){
            newArr[i-1]=arr[i];
        }

        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}