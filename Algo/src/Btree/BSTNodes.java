package Btree;

 public class BSTNodes {
    BSTNodes left, right;
    int data;
 
    /* Constructor */
    public BSTNodes() 
    {
        left = null;
        right = null;
        data = 0;
    }
 
    /* Constructor */
    public BSTNodes(int n) 
    {
        left = null;
        right = null;
        data = n;
    }
 
    /* Function to set left node */
    public void setLeft(BSTNodes n) 
    {
        left = n;
    }
 
    /* Function to set right node */
    public void setRight(BSTNodes n) 
    {
        right = n;
    }
 
    /* Function to get left node */
    public BSTNodes getLeft() 
    {
        return left;
    }
 
    /* Function to get right node */
    public BSTNodes getRight() 
    {
        return right;
    }
 
    /* Function to set data to node */
    public void setData(int d) 
    {
        data = d;
    }
 
    /* Function to get data from node */
    public int getData() 
    {
        return data;
    }
}