import java.util.ArrayList;
import java.util.ListIterator;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("amreena");
        myList.add("is");
        myList.add("actual");
        myList.add("the");
        myList.add("goat");
        System.out.println("Problem 1: " + maxLength(myList));
        System.out.println("Problem 2: " + swapPairs(myList));
        System.out.println("Problem 3: " + removeEvenLength(myList));
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(1);
        System.out.println("Problem 4: " + filterRange(intList, 5, 7));
        ArrayList<String> mirrored = new ArrayList<>();
        mirrored.add("a");
        mirrored.add("b");
        mirrored.add("c");
        System.out.println("Problem 5: " + mirror(mirrored));

    }
    public static int maxLength(ArrayList<String> list){
        if(list.isEmpty()){
            return 0;
        }
        int current = 0;
        int max = list.get(0).length();
        for(int i = 1; i < list.size(); i++){
            current = list.get(i).length();
            if(max < current){
                max = current;
            }
        }
        return max;

    }

    public static ArrayList<String> swapPairs(ArrayList<String> list){
        String cur;
        for(int i = 0; i < list.size() - 1; i+=2){     
            cur = list.get(i);  
            list.set(i, list.get(i+1));
            list.set(i+1, cur);
        }
        return list;
    }

    public static ArrayList<String> removeEvenLength(ArrayList<String> list){
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String current = it.next();
            if(current.length() % 2 == 0){
                it.remove();
            }
        }
        return list;
        

    }

    public static ArrayList<Integer> filterRange(ArrayList<Integer> list, int min, int max){
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            int cur = it.next();
            if(cur >= min && cur <= max){
                it.remove();
            }
        }
        return list;
    }   

    public static ArrayList<String> mirror(ArrayList<String> list){
        for(int i = list.size() -1; i >= 0; i--){
            list.add(list.size(), list.get(i));
        }
        return list;
    }
}
