public class App {
    public static void main(String[] args) throws Exception {
        countDown(10);
    }

    public static void countDown(int n){
        if(n == 0){
            System.out.println("Done.");
        }
        else {
            System.out.print(n + ", ");
            countDown(n-1);
        }

    }
}
