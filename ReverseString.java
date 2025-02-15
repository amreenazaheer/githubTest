public class ReverseString {
    public static void main(String[] args) throws Exception {
        System.out.println(reverseRecursive("cat"));
    }

    public static String reverseRecursive(String str){
        if(str.length() == 1){
            return str;
        }
        else{
            int len = str.length() - 1;
            return str.charAt(str.length() -1) + reverseRecursive(str.substring(0, len));
        }

    }
}
