/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;




/**
 *
 * @author user
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("\n...........Array List...............");
    ArrayList<String> cars = new ArrayList<String>();
    System.out.println("Cars:"+cars);
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("Toyoyta");
    System.out.println(cars);
    System.out.println(cars.get(2));
    cars.add(0, "Wolskvogen");
    //cars.set(0, "Wolskvogen");
    System.out.println(cars);
    for(String i:cars){
        System.out.println(i);
    }
    Collections.sort(cars);
    System.out.println(cars);
    cars.remove(2);
    System.out.println(cars);
    String[] arr = new String[cars.size()];
    cars.toArray(arr);
    System.out.print("Array: ");
    for(String item:arr) {
      System.out.print(item+", ");
    }
    System.out.println();
    System.out.println("\n...........Stack ...............");
    Stack<String> lecture= new Stack<>();
    lecture.push("Java");
    lecture.push("Linux");
    lecture.push("Web");
    System.out.println("Stack: " + lecture);
    String element = lecture.pop();
    System.out.println("Removed Element: " + element);
    System.out.println("Stack: " + lecture);
    element = lecture.peek();
    System.out.println("Element at top: " + element);
    int x=lecture.search("Linux");
    System.out.println(x);
    System.out.println("\n...........Linked List...............");
    //Linked List
    LinkedList<String> animals = new LinkedList<>();
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);
    animals.add(1, "Horse");
    System.out.println("Updated LinkedList: " + animals);
    animals.addFirst("Lion");
    animals.addLast("Pars");
    System.out.println("Updated LinkedList: " + animals);
    animals.removeLast();
    //animals.remove(1);
    System.out.println("Updated LinkedList: " + animals);
    System.out.println("Index of LinkedList: " + animals.indexOf("Cow"));
    ListIterator<String> iterate = animals.listIterator();
    System.out.print("LinkedList: ");
    while(iterate.hasNext()) {
        System.out.print(iterate.next());
        System.out.print(", ");
    }
    System.out.println();
    ListIterator<String> listIterate = animals.listIterator();
    System.out.print("\nReverse LinkedList: ");
    while(listIterate.hasPrevious()) {
        System.out.print(listIterate.previous());
        System.out.print(", ");
    }
    System.out.println();
    System.out.println("\n...........Queue List...............");
    Queue<String> languages = new LinkedList<>();
    // add elements
    languages.add("Python");
    languages.add("Java");
    languages.add("C");
    System.out.println("LinkedList: " + languages);
    // access the first element
    String str1 = languages.peek();
    System.out.println("Accessed Element: " + str1);
    // access and remove the first element
    String str2 = languages.poll();
    System.out.println("Removed Element: " + str2);
    System.out.println("LinkedList after poll(): " + languages);
    // add element at the end
    languages.offer("Swift");
    System.out.println("LinkedList after offer(): " + languages);
    System.out.println();
    System.out.println("\n...........MAP...............");
    Map<String, Integer> numbers = new HashMap<>();
        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);
        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());
        // Access values of the map
        System.out.println("Values: " + numbers.values());
        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());
        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
        
        System.out.println();
        System.out.println("\n...........SET...............");
        Set<Integer> set1 = new HashSet<>();
        // Add elements to the set1
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);
        // Creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();
        // Add elements
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);
        // Union of two sets
        set2.addAll(set1);
        System.out.println("Union is: " + set2);
 
    }
    
}
