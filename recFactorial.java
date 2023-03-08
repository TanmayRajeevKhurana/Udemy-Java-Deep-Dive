public class recFactorial {
    public static void main(String[] args) {

        System.out.println(recursiceFac(3));
        System.out.println(iterativeFac(3));
        
    }

    // factorial
    // 3!=3*2*1
    // 2!=2*1
    // 1!=1

    // Factorials equal to the multiplication of the number with the Factorial of the last number
    // 3!=3*(2!)
    // 2!=2*(1!)
    // 1!=1*(0!)
    // 0!=1

    // Recursive Factorial Works in a call Stack , A BREAK CASE NEEDS TO BE PRESENT OTHERWISE IT WILL RESULT IN A STACK OVERFLOW

    public static int recursiceFac(int num){
        if(num==0){
            return 1;
        }//Break statement for the recursive Fuction
        return num*recursiceFac(num-1);
        // n!=n*(n-1)!
        
    } 

    public static int iterativeFac(int num){
        if(num==0){
            return 1;
        }
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }
}
