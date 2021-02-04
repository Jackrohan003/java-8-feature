import java.util.*;
class Main {  
  public static void main(String args[]) { 
    
    List<Integer> list = Arrays.asList(2,3,4,5);
    
    System.out.println(list.stream().map(num->num*2).reduce(0,(c,e)->c+e));//It will give result 28
    
  } 
  
}
