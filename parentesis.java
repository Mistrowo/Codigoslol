import java.util.Scanner;
import java.util.Stack;

public class solemne {
      static Stack <Character>pila = new Stack<Character>();  

      private static void verificar (char d) {
          if (pila.empty()) {
          System.out.println("ERROR"); 
          System.exit(0); 
          } else {
          Character s = (Character) pila.pop();  
          if (d != s.charValue()) {
              System.out.println("ERROR"); 
              System.exit(0); 
          }
          }
      }
        
      public static  void Parentesis (String linea) {
          for (int i = 0; i < linea.length(); i++) {
          if (linea.charAt(i) == '(') pila.push(')');
          else if (linea.charAt(i) == '{') {
              pila.push('}');
          }
          else if (linea.charAt(i) == '[') {
              pila.push(']');
          }
          else if (linea.charAt(i) == ')') {
              verificar(')');
          }
          else if (linea.charAt(i) == '}') {
              verificar('}');
          }
          else if (linea.charAt(i) == ']') {
              verificar(']');
          }
          }

          if (pila.empty())
          System.out.println("OK");
          else 
          System.out.println("ERROR");      
      }

       
     
      public static void main (String [] args) {
          Scanner lector=new Scanner(System.in);
          String a;
          a=lector.nextLine();
          Parentesis(a);
      }

      
    }
     
       