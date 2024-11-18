class RemoveDuplicate{

    public static void main(String[] args){
        int arr[]={1,2,2,3,4,4,5};
        int newArr[]= new int[arr.length];
        int newSize=0;

        for(int i=0;i<arr.length;i++){
          boolean  isDuplicate=false;
            for(int j=0;j<newSize;j++){

                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
                if(!isDuplicate){
                    newArr[newSize]=arr[i];
                    newSize++;
                }
            
        }
        for(int i=0;i<newSize;i++){
            System.out.println(newArr[i]);
        }
    }
}