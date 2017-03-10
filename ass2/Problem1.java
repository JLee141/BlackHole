public class Problem1
{
    public static void main(String[] args)
    {
        MySingleLinkedList list = new MySingleLinkedList();

        //Generate 10 random node 
        list.add(1);
        list.add(99);
        list.add(3);
        list.add(31);
        list.add(96);
        list.add(92);
        list.add(24);
        //Print list 
        list.print();

        //REmove a number that exist 
        list.remove(31);

        //print list to cofirm
        list.print();

        //REmove a number that does not exist 
        list.remove(100);


    }

}

public class MySingleLinkedList
{
   private Node first; //Head node
    /*
        Node so this is our Pizza, In linear world in  
        Continas data, and pointer to the next positiion in the list 
        Use Constructor to be setters 
    */
    private class Node<Object>{
        Node(){
            this(null, null);
        }
        Node(Object d){
            this(d, null);
        }
        Node(Object d, Node n){
            data = d; 
            next = n;
        }
        //In OOP really should declare these little guys private lol
        Object data;
        Node next;
    }
    /*
        return the size of the linekd list 
    */
    public int size()
    {
        /*  
            //Iterative Size: create iterate through list and keep counter 
            int counter = 0;
            Node current = first; 
            while(current!= null) { counter++;
                current=current.next;
            }
            return counter;
        */

        //Recursive, reutrn 0 if head is null, return 1 + next road on the stack 
        return getSize(first);
    }
    private int getSize(Node<Object> first)
    {
        if(first == null){
            return 0;
        }
        else {
            return 1 + getSize(first.next);
        }
    }
    

    /*
        print the linked list
    */
    public void print()
    {
        //Same as return size, just with system.out, 
        
        Node<Object> current = first; 
        while(current != null){
            System.out.print(current.data + "  ");
            current = current.next;
        }
    }
    /*
     test if a value x is contained in the linked list 
    */
    public boolean contains(Object x)
    {
        //Option a Iterative 
        //option b recursive  

        /*
        
        boolean flag = false;
        Node current = first; 
        while(current != null){
            if(x.equals(current.data)){
                return true;
            }
            current = current.next;
        }
        return false;
        */

        if(x.equals(first.data))
            return true; 
        else if(first.next == null)
            return false; 
        else 
            return contains(first.next);
            //return first.next.contains(x);
    }
    /*
        add a value x if it is not already contianed in the linked list 
    */
    public boolean add(Object x)
    {
        //If list is null, x can not be in the list, else list might be longer than 1 check 
       if(first == null){
            Node newNode = new Node(x);
            newNode.next = first; 
            first = newNode;
            return true;
       }
       else{
            if(!contains(x)){
                //Checked list insert at the end 
                Node<Object> newNode = new Node(x);
                Node<Object> current = first 

                newNode.next = null;

                while(current != null){
                    System.out.print(current.data + "  ");
                    current = current.next;
                }
                current.next = newNode;
                return true;
            } 
            return false;
       }
         
    }
    /*
        remove a value x if is contained in the linked list 
    */
    public boolean remove(Object x)
    {
      

        if(first == null){
            return false;
        }
        else{
              //Don't want to loose the list 
                Node temp = first; 
                Node prev = null;
                
                if(contains(x)){
                    //remove first link 
                    if(temp.data.equals(x)){
                        first = temp.next; 
                        return true;
                    }
                    //loop though setting current node to prev 
                    //current = next node 
                    while(temp != null && temp != key)
                    {
                        prev = temp; 
                        temp = temp.next; 
                    }
                    //move link ptr 
                    prev.next = temp.next; 
                    return true;
                }
                return false;
        }
      
    }
} 