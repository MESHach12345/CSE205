package Assignment6;

public class MyBSTree<T extends Comparable <T>> implements ITree<T> {
   
    private Node root;
    private int size;
     public void insert(T item)
     {
        
        if(root == null)
        {
         root = new Node(item);
         size++;
         return;
        }
        if(containsItem(item))
        {
         return;  
        }
        else
        {  
          root.insert(item);
           
        }
        size++;
     }
     public boolean containsItem(T item)
     {
        if(root==null)
        {
         return false;  
        }
        Node currentNode = root;
          
          while(currentNode!=null)
          {
             if((currentNode.data).equals(item))
             {
              return true;  
             }
           if((currentNode.data).compareTo(item)<0)
           {
              if(currentNode.right!=null)
                 currentNode = currentNode.right;
              else
                 break;
           }
           
           if((currentNode.data).compareTo(item)>0)
           {
            if(currentNode.left!=null)
              currentNode = currentNode.left;
            else
              break;
           }
             
          }
          return false;
     }
 
     public int getSize()
     {  
        return size;
        
     }
     public void printInOrder()
     {
        iterate(root);
       
     }
     public void iterate(Node a)
     {
        if(a!=null)
       {
        iterate(a.left);
        
        System.out.print(a.data + " ");
        iterate(a.right);  
        
       }
     }
     public String toString()
     {
        String a = iterate2(root);
        return a;   
     }
     
         public String iterate2(Node a)
     {
       String y = "";
       if(a.left != null)
       {
           y = y + iterate2(a.left);
       }
       
       y = y + (a.data) + " ";
       
       if(a.right != null)
       {
           y = y + iterate2(a.right);
       }
       return y;
     }
     
     class Node
     {
        public T data;
        public Node left;
        public Node right;
        
        public Node(T data)
        {
           this.data = data;
        }
        
        
          public void insert(T item)
        {
           Node currentNode = this;
           if(item.equals(currentNode.data))
              return;
           while(true)
           {
              if((currentNode.data).compareTo(item)<0)
              {
                 if(currentNode.right == null)
                 {
                    currentNode.right = new Node(item);   
                    break;
                 }
                 else
                 {
                   currentNode = currentNode.right;
                 }
 
              }
              else
              {
                 if(currentNode.left == null)
                 {
                    currentNode.left = new Node(item);
                    break;
                 }
                 else
                 {
                   currentNode = currentNode.left;
                 }
 
              
              }
           }
         
          
       }
        
 
        
     }
     
 }