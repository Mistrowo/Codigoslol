import java.util.Scanner;


public class List {
   Nodo cabeza;
   Nodo tail;
   List(){
       cabeza=tail=null;
       return;
   }
   static class Nodo {
       int valor;
       Nodo siguiente;
       
       Nodo(int v) {
           valor = v;
           siguiente = null;
       }
   }
  
   public void imprimir() 
   { 
       Nodo n = cabeza; 
       while (n != null) { 
           System.out.print(n.valor + " "); 
           n = n.siguiente; 
       } 
   } 
   public void push(int x) {
       Nodo a= new Nodo(x);
       if(cabeza==null) {
           cabeza=tail=a;
           return;
       }
       tail.siguiente=a;
       tail=a;
       
   }
   
   public void  reverse() {
       if(cabeza==null)
           return ;

           Nodo temp=cabeza;
           Nodo prev=null;
           Nodo next =null;

           while(temp!=null){

             
             if(temp==cabeza){
             prev=temp;
             next=temp.siguiente;
             prev.siguiente=null;
             
             }else{

           next=temp.siguiente;
           temp.siguiente=prev;
           prev=temp;

             }
           temp=next;
           }

           cabeza=prev;


           }
        
        
   public static void main(String[] args)
   {
     List lista= new List();
     Scanner lector=new Scanner(System.in);
     int a=lector.nextInt();
     int arreglo[]=new int[a];
     for(int i=0; i<arreglo.length;i++) {
         arreglo[i]=lector.nextInt();
     }
     for(int j=0; j<arreglo.length;j++) {
         lista.push(arreglo[j]);
         
     }
     
     lista.reverse();
     lista.imprimir();
     
     
   }
}