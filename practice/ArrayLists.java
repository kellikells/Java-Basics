import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(10);
        list.add("Hello");
        list.add(new ArrayList<Integer>());
        list.add(new Double(12.0)); // adding a Double of value 12.0
        // list.clear();

        // list.isEmpty();
        System.out.println(list.isEmpty()); // false
                
        System.out.println(list); // [10, "Hello", [], 12.0]

    }
}

