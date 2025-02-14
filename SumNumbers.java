public class SumNumbers {
    public static void main(String[] args) throws Exception {
        System.out.println(sumRecursive(6));
    }

    public static int sumRecursive(int n){
        if(n == 1){
            return 1;
        }
        else {
            return n + sumRecursive(n-1);
        }

    }
}
