/*  Class nextedStack  */
class OurListStack
{
	class Node
	{
		int data;
		Node next;

	}
 
    Node top ;
    int size ;
 
    // constructor
    public OurListStack()
    {
        top = null;
        size = 0;
    }    
    
	// check if stack is empty
    public boolean isEmpty()
    {
		if (top == null) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		// or simplified as return top == null;
    }    
    
	
    // push(int value)
    public void push(int x)
    {
        Node temp = new Node();
        temp.data = x;
		temp.next = top;
        top = temp;
        size++ ;
    }    
    // int pop()
    public int pop()
    {
        if (isEmpty() )
		{
           System.out.println("The Stack is Empty.");
		   return -1;
		}
		else
		{
			Node temp = new Node();
			temp = top;
			top = temp.next;
			size-- ;
			return temp.data;
		}
    }    
      
    
	// print()
    public void print()
    {
        //System.out.print("\nStack = ");
		System.out.println();
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node temp = top;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();        
    }
	
	// size()
    public int size()
    {
        return size;
    } 

	// peek ()
    /* public int peek()
    {
        if (isEmpty() )
            System.out.println("The Stack is Full.");
        return top.getData();
    } */ 
}
/*  Class Node  */

