import java.util.ArrayList;
import java.util.List;

public class Exceptions1 {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello World");
        myList.add(48);
        myList.add("Goodbye World");


        System.out.println(myList);
        try {
            for(int i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            }
        } catch (ClassCastException e){
            System.out.println("ClassCastException: " + e.getMessage());
        } 



    }
}
