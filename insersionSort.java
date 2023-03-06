public class insersionSort {
    public static void main(String[] args) {
        int arr[]={20,35,-15,7,55,1,-22};

        for(int firstunsortedelement=1;firstunsortedelement<arr.length;firstunsortedelement++){
            int newelement=arr[firstunsortedelement];

            int i ;
            for(i=firstunsortedelement;i>0 && arr[i-1]>newelement;i--){
                arr[i]=arr[i-1];
            }
            arr[i]=newelement;
        }

        

        for(int p=0;p<arr.length;p++){
            System.out.println(arr[p]);
        }

    }


    
}
