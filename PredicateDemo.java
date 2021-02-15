import java.util.function.*;
class Main {  
  public static void main(String args[]) { 

Predicate<String> predicate = (s) -> s.length() > 0;

System.out.println(predicate.test("foo"));              // true
System.out.println(predicate.negate().test("foo"));     // false


  
Predicate<String> isEmpty = String::isEmpty;
Predicate<String> isNotEmpty = isEmpty.negate();

System.out.println(isEmpty.test(""));



  } 
}
