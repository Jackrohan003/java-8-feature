interface staticCheck
{

    static void print()
    {
        System.out.println("static method called");
    }
}

public class StaticMethod  implements staticCheck{  
   
  public static void main(String args[]) { 
    
    staticCheck.print();
    
  } 
}
