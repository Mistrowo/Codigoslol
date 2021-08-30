import java.util.Scanner;
import java.util.Stack;
public class solucion{
    public static String idioma(String palabra) {
        String resultado = "";
        Stack<Integer> b = new Stack<>();
        Stack<String> c = new Stack<>();
        int indice = 0;
        while (indice < palabra.length()) {
            if (Character.isDigit(palabra.charAt(indice))) {
                int contador = 0;
                while (Character.isDigit(palabra.charAt(indice))) {
                    contador = 10 * contador + (palabra.charAt(indice) - '0');
                    indice++;
                }
                b.push(contador);
            }
            else if (palabra.charAt(indice) == '[') {
                c.push(resultado);
                resultado = "";
                indice++;
            }
            else if (palabra.charAt(indice) == ']') {
                StringBuilder aux = new StringBuilder (c.pop());
                int repetidos = b.pop();
                for (int i = 0; i < repetidos; i++) {
                    aux.append(resultado);
                }
                resultado = aux.toString();
                indice++;
            }
            else {
                resultado += palabra.charAt(indice++);
            }
        }
        return resultado;
    }
    public static void main(String args[]) {
        Scanner lector=new Scanner(System.in);
        String palabra=lector.nextLine();
        System.out.println(idioma(palabra));
    }
}

