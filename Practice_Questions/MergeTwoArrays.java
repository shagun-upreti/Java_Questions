class MergeTwoArrays{
     
     public static void main(String[] args){

         
         int arr1[]={1,2,3,4,5};
         int arr2[]={6,7,8,9,10};

         int newArr[]=new int[arr1.length + arr2.length];

         for(int i=0;i<arr1.length;i++){
            newArr[i]=arr1[i];
         }
          
        for(int i=0;i<arr2.length;i++){
            newArr[i+arr1.length]=arr2[i];
        }

        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
     }
}