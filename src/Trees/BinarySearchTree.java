package Trees;

import Recursion.BinarySearch;

public class BinarySearchTree {
    public class Node{
        int data;
        Node left;
        Node right;
        int hight;
        Node(int data){
            this.data=data;
        }
        public int getdata(){
            return data;
        }
    }
    Node root;
    public BinarySearchTree(){

    }
    public int hight(Node node){
        if(node==null){
            return -1;
        }
        return node.hight;
    }
    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int data){
        root=insert(data,root);
    }
    public Node insert(int data,Node node){
        if(node==null){
            node=new Node(data);
            return node;
        }
        if(data<node.data){
            node.left=insert(data,node.left);
        }
        if(data>node.data){
            node.right=insert(data,node.right);
        }
        node.hight=Math.max(hight(node.left),hight(node.right))+1;
        return node;
    }

    public boolean balenced(){
        return balenced(root);
    }
    public boolean balenced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(hight(node.left)-hight(node.right))<=1 && balenced(node.left) &&balenced(node.right);

    }
    public void populate(int[] n){
        for(int i=0; i<n.length; i++){
            this.insert(n[i]);
        }
    }
    public void populateSorted(int[] n){
        populateSorted(n,0,n.length);
    }
    public void populateSorted(int[] n,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(n[mid]);
        populateSorted(n,start,mid);
        populateSorted(n,mid+1,end);
    }
    public void preorder(){
        preorder(root);
    }
    public void preorder(Node n){
        if(n==null){
            return;
        }
        System.out.print(n.data+" ");
        preorder(n.left);
        preorder(n.right);
    }
    public void inorder(){
        preorder(root);
    }
    public void inorder(Node n){
        if(n==null){
            return;
        }
        inorder(n.left);
        System.out.print(n.data+" ");
        inorder(n.right);
    }
    public void postorder(){
        postorder(root);
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
        display(this.root,"Root Node");
    }
    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.data);
        display(node.left,"This is left child of"+node.data+" : ");
        display(node.right,"This is right child of"+node.data+" : ");
    }
}
