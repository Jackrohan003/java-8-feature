
interface Left
  {
    default void common()
    {
      System.out.println("Left called");
      
    }
  }

interface Right
  {
    default void common()
    {
      System.out.println("Right called");
      
    }
  }

class DefaultOverride implements Left,Right { 

  public void common()
  {
    System.out.println("Overrided methood ");
    Left.super.common();
    Right.super.common();
  }
  
  public static void main(String args[]) { 
    
    DefaultOverride m1 = new DefaultOverride();
    m1.common();
    
     
  } 
}
