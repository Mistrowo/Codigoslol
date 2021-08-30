import java.util.Scanner;

public class Prefijo {
        public static String prefijo(String a []) {
            if(a==null || a.length==0) {
                return "";
            }
            String b=a[0];
            for(int i=1;i<a.length;i++) {
                String aux=a[i];
                int j=0;
                while(j<aux.length() && j<b.length() && aux.charAt(j)==b.charAt(j) ) {
                    j++;
                }
                if(j==0) {
                    return "";
                }
                b=aux.substring(0,j);
                    
            }
            return b;
        }
        public static void main(String args []) {
            Scanner lector=new Scanner (System.in);
            int b=lector.nextInt();
            String aux;
            String []a= new String [b];
            for(int i=0;i<a.length;i++) {
                aux=lector.next();
                a[i]=aux;
                    
            }
            String result=prefijo(a);
            System.out.println(result);
        }
    }


