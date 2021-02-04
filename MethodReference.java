//Method reference in java 8 
import java.util.*;
class Main {  
  public static void main(String args[]) { 
    
    List<Integer> list = Arrays.asList(2,3,4,5);
    
    list.forEach(System.out::println);//Method reference 
  } 
}
