import java.util.*;



import java.io.*;
class par{
    int key;
    int value;
    
par(int key, int value){
    
    this.key=key;
    this.value=value;
    
}
}

public class Ordenar {
    public static void ordenar(par[] a) {
        
        int i, j ;
        par aux;
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                
                if ( a[j].value  < a[j + 1].value  ) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
}
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int N = lector.nextInt();
        
        int M = lector.nextInt();
        
        LinkedHashMap<Integer, Integer> numeros = new LinkedHashMap<Integer, Integer>();
        
        for(int i = 0; i < N; i++)
            
        {
            int n = lector.nextInt();
            if(M<n) {
                continue;
            }
            int contador = numeros.containsKey(n) ? numeros.get(n) : 0;
            numeros.put(n, contador + 1);
        }
        
        ArrayList<par> arr=new ArrayList<par>();
        Object[]a;
        a=numeros.keySet().toArray();
        
        par ar[]=new par[a.length];
        
        for(int i=0;i<a.length;i++) {
            ar[i]=new par((int)a[i],numeros.get(a[i]));
            
        }
        ordenar(ar);
        for(int j=0;j<ar.length;j++) {
            
            for(int i=0;i<ar[j].value;i++) {
                
                System.out.print(ar[j].key + " ");
            }
        }
}
    
}
    