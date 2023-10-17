import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        
        // Accessing elements by index
        int secondElement = numbers.get(1);
        System.out.println("Second element: " + secondElement);
        
        // Modifying an element
        numbers.set(0, 25);
        
        // Removing an element
        numbers.remove(2);
        
        // Size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);
        
        // Iterating through the ArrayList
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}