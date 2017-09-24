package Btree;

import java.util.Random;

public class Sort_BTree 
{
    public static int N = 20;
 
    public static void main(String args[]) 
    {
        Random random = new Random();
        BT bt = new BT();
 
        System.out
                .println("Sorting of randomly generated numbers using B TREE");
 
        for (int i = 0; i < N; i++)
            bt.insert(Math.abs(random.nextInt(100)));
 
        System.out.println("The elements of the tree: ");
        bt.preorder();
 
        System.out.println("\nThe sorted sequence is: ");
        bt.inorder();
    }
}