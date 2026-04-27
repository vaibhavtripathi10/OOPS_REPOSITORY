public class variable {
   String myvar = "Tanishq";
   private char[] variable;
   static String my = "Tanishq";
   public void mymethod(){
    String myvar = "Kale";
    System.out.println(myvar);
   };
public static void main(String[] args) {
     variable obj = new variable();
    System.out.println("The variable");
    obj.mymethod();
    System.out.println(obj.variable);
}
   
    
}
