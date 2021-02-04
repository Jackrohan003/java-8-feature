//For Each loop is faster than other loop since it is internal loop.
import java.util.*;
class ForEachMethod {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
    List<Integer> list = Arrays.asList(2,3,4,5);
    list.forEach(num->System.out.println(num));
    
    List<String> stringList = Arrays.asList("Rohan","Varun","Smit");
    
    stringList.forEach(str->System.out.println(str));
    
  } 
}
