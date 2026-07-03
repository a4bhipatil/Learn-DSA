package Trees;

import java.util.*;
public class BinaryTree {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    Node root;
    public void insert(Scanner sc){
        System.out.println("enter the root Node ");
        int data=sc.nextInt();
        root=new Node(data);
        insert(sc,root);
    }
    public void insert(Scanner sc,Node n){
        System.out.println("Do you want to enter left:"+n.data);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("enter the value of left: "+n.data);
            int data=sc.nextInt();
            n.left=new Node(data);
            insert(sc,n.left);
        }
        System.out.println("Do you want to enter right:"+n.data);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the value of right:"+n.data);
            int data=sc.nextInt();
            n.right=new Node(data);
            insert(sc,n.right);
        }
    }
    public void preorder(Node n){
        if(n==null){
            return;
        }
        System.out.print(n.data+" ");
        preorder(n.left);
        preorder(n.right);
    }
    public void inorder(Node n){
        if(n==null){
            return;
        }
        inorder(n.left);
        System.out.print(n.data+" ");
        inorder(n.right);
    }
    public void postorder(Node n){
        if(n==null){
            return;
        }
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.data+" ");
    }
    public void display(){
        display(root,0);
    }
    public void display(Node n,int level){
        if(n==null){
            return;
        }
        display(n.right,level+1);
        for(int i=0; i<level; i++){
            System.out.print("  ");
        }
        System.out.println(n.data);
        display(n.left,level+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.insert(sc);
        System.out.println("Tree");
        tree.display();
        System.out.println("preorder\n");
        tree.preorder(tree.root);
        System.out.println("inorder");
        tree.inorder(tree.root);
        System.out.println("postorder");
        tree.postorder(tree.root);
    }
}