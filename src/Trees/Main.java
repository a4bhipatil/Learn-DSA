package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BinarySearchTree tree=new BinarySearchTree();
        int[] n={10,9,8,7,6,5,4,3,2,1 };
        tree.populateSorted(n);
        tree.display();
    }
}
