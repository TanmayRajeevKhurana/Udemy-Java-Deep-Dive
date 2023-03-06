public class array {
    public static void main(String[] args) {
        int[] intarr = new int [7] ;
        intarr[0]=1;
        intarr[1]=-20;
        intarr[2]=3;
        intarr[3]=34;
        intarr[4]=43;
        intarr[5]=2;
        intarr[6]=5;

        int index=0;
        for(int i=0;i<intarr.length;i++){
            if(intarr[i]==2){
            index = i;
            break;
            }

        }
        System.out.println("Index = "+index);
        // if the index is given to us to find the element the time complexity is o(constant) whereas when the index is not given and we need to check the whole array then the time complexity is O(n)
        
    }
}
