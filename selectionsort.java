public class selectionsort {
    
    public static void main(String[] args) {
        int arr[]={20,35,-15,7,55,1,-22};
        for(int lastunsortediindex=arr.length-1;lastunsortediindex>0;lastunsortediindex--){
            int largest =0;
            for(int i=1;i<=lastunsortediindex;i++){
                if(arr[i]>arr[largest]){
                    largest = i;
                }
            }
            swap(arr, lastunsortediindex, largest);
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

