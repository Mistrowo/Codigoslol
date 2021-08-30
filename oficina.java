import java.util.*;
import java.io.*;

class Node {
    Node izq;
    Node der;
    int value;
    
    Node(int data) {
        this.value = data;
        izq = null;
        der = null;
    }
}

public class Solution {

    
   
 static int sol(Node n, int v1, int v2) {
    while (n != null) {
        if (n.value > v1 && n.value > v2) {
            n = n.izq;
        } else if (n.value < v1 && n.value < v2) {
            n = n.der;
        } else {
            break;
        } 
    }
    return n.value;
}
    

    public static Node insert(Node raiz, int aux) {
        if(raiz == null) {
            return new Node(aux);
        } else {
            Node cur;
            if(aux <= raiz.value) {
                cur = insert(raiz.izq, aux);
                raiz.izq = cur;
            } else {
                cur = insert(raiz.der, aux);
                raiz.der = cur;
            }
            return raiz;
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();
        Node root = null;
        while(a-- > 0) {
            int data = lector.nextInt();
            root = insert(root, data);
        }
             
        
         int N=lector.nextInt();
        
         int [] q=new int [N];
         for(int i=0;i<N;i++) {
             int v1=lector.nextInt();
             int v2=lector.nextInt();
             q[i]=sol(root,v1,v2);
             
         }
         for(int i=0;i<N;i++) {
            System.out.println(q[i]);
             
         }
              
               
         
         
              
       }
                   
                 
                          
    }    