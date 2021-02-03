interface CheckDefault
{

    default void print()
    {
        System.out.println("From Interface");
    }
}

 class C
{
    public void print()
    {
        System.out.println("From c");
    }
}

public class DefaultMethodFromClass extends C implements CheckDefault{  
   
  public static void main(String args[]) { 
    DefaultMethodFromClass m = new DefaultMethodFromClass();
    m.print();// It will print From C : As Class has higher priority  to interface
    
  } 
}
