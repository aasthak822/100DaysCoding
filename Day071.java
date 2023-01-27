/* Program to insert an element at the Bottom of a stack 
SOLUTION */

public class Stack {
	
	static void insertToBottom(Stack<Integer> S, int N)
	{
	     
	    // Temporary stack
	    Stack<Integer> temp = new Stack<>();
	 
	    // Iterate until S becomes empty
	    while (!S.empty())
	    {
	 
	        // Push the top element of S
	        // into the stack temp
	        temp.push(S.peek());
	 
	        // Pop the top element of S
	        S.pop();
	    }
	 
	    // Push N into the stack S
	    S.push(N);
	 
	    // Iterate until temp becomes empty
	    while (!temp.empty())
	    {
	 
	        // Push the top element of
	        // temp into the stack S
	        S.push(temp.peek());
	 
	        // Pop the top element of temp
	        temp.pop();
	    }
	 
	    // Print the elements of S
	    while (!S.empty())
	    {
	        System.out.print(S.peek() + " ");
	        S.pop();
	    }
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	     
	    Stack<Integer> S = new Stack<>();
	    S.push(5);
	    S.push(4);
	    S.push(3);
	    S.push(2);
	    S.push(1);
	 
	    int N = 7;
	 
	    insertToBottom(S, N);
	}
	}