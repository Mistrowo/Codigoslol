import java.util.Scanner;
public class Ramos {
    public static void ordenar(int[] a) {
        
        int i, j ;
        int aux;
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
}
    public static float promedio (int arr []) {
        float suma=0;
        for(int i=0;i<arr.length;i++) {
            suma=suma+arr[i];
            
        }
        suma=suma/arr.length;
        return suma;
            
        }
    
    
        public static void calculo(int arr [],float suma) {
            int a=0;
            ordenar(arr);
            while(suma<4.5) {
                arr[a]=5;
                a++;
                suma=promedio(arr);
                
            }
            
            System.out.println(a);
                
        }
        
                    
                
    
    

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in) ;
        int a=lector.nextInt();
        int arr[]=new int[a];
        float aux=0;
        for(int i=0;i<arr.length;i++) {
            arr[i]=lector.nextInt();
            
        }
        
        aux=promedio(arr);
        calculo(arr,aux);
        
    
}
    
}

