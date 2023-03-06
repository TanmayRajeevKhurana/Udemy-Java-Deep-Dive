public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={22,-4,-2,55,62,14};
        for(int lastunsortedindex=arr.length-1;lastunsortedindex>0;lastunsortedindex--){
            for(int i=0;i<lastunsortedindex;i++){
                if(arr[i]>arr[i+1])
                swap(arr,i,i+1);
            }
        }

        for(int p=0;p<arr.length;p++){
            System.out.println(arr[p]);
        }

    }
    public static void swap(int array[],int i, int j){
        if(i==j)
        return;
        
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
// the time complexityof bubble sort is O(n2) as it uses a nested loop to traverse through the array where the outer loop represents the lastunsorted element and the job of the inner loop is to swap the values of two considing indices
