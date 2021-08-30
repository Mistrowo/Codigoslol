import java.io.*;
import java.util.*;
import java.util.LinkedList; 


class TreeNode{
    public int value;
    public TreeNode left;
    public TreeNode rigth;
    public TreeNode(int value){
        this.value = value;
        this.left = null;
        this.rigth = null;
    }
}
class BinarySearchTree{
    ArrayList lista=new ArrayList();
    public TreeNode root;
    public BinarySearchTree(){
        root = null;
    }
    
    public void insertRec(int newValue){
        if(this.root == null){
            this.root = new TreeNode(newValue);
            return;
        }
        insertRecc(this.root, newValue);
    }
    private TreeNode insertRecc(TreeNode root, int newValue){
        if(root == null){
            return new TreeNode(newValue);
        }
        if(newValue < root.value){
            root.left = insertRecc(root.left, newValue);
        }else{
            root.rigth = insertRecc(root.rigth, newValue);
        }
        return root;
    }
    public void suma(String a, String b){
        TreeNode x = root;
        TreeNode y = root;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '1'){
                 x = x.rigth;
               
            }else{
                 x = x.left;
            }
        }
        for(int i=0; i<b.length(); i++){
            if(b.charAt(i) == '1'){
                 y = y.rigth;
                
            }else{
                y = y.left;
            }
        }
        lista.add(x.value + y.value);
    }
    public void imprimir(){
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
public class NewClass {
    public static void main(String args[]){
        BinarySearchTree arbol = new BinarySearchTree();
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = lector.nextInt();
        }
        for(int i=0; i<n; i++){
            arbol.insertRec(arr1[i]);
        }
        int q = lector.nextInt();
        for(int i=0; i<q; i++){
            String a = lector.next();
            String b = lector.next();
            arbol.suma(a, b);
        }
        arbol.imprimir();
    }
}

