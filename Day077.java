/* Write a program to find largest Rectangular Area in a histogram using stack 
SOLUTION */



import java.util.Stack;
  
public class RectArea {
    
    static int getMaxArea(int hist[], int n)
    {
       
        Stack<Integer> s = new Stack<>();
  
        int max_area = 0;  int tp; 
        int area_with_top; 
        int i = 0;
        while (i < n) {
           
            if (s.empty() || hist[s.peek()] <= hist[i])
                s.push(i++);
  
            
            else {
                tp = s.peek(); // store the top index
                s.pop(); // pop the top
  
                area_with_top
                    = hist[tp]
                      * (s.empty() ? i : i - s.peek() - 1);
  
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }
  
       
        while (s.empty() == false) {
            tp = s.peek();
            s.pop();
            area_with_top
                = hist[tp]
                  * (s.empty() ? i : i - s.peek() - 1);
  
            if (max_area < area_with_top)
                max_area = area_with_top;
        }
  
        return max_area;
    }
  
    public static void main(String[] args)
    {
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
  
        
        System.out.println("Maximum area is "
                           + getMaxArea(hist, hist.length));
    }
}