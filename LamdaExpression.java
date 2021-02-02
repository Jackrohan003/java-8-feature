import java.util.*;
class Main {  
  public static void main(String args[]) { 
    List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

//without lamda expression
Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
});
//With lamda expression
Collections.sort(names, (String a, String b) -> {
    return b.compareTo(a);
});

names.forEach((str)->System.out.println(str));
    
  } 
}
