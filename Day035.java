/* Given a route containing 4 directions( E,W,N,S).Find the shortest path to reach destination. 
WNEENESENNN

SOLUTION : */


public class ShortestPath {
	
	public static float getshortestpath(String path) {
	
		int x=0,y=0;

		for(int i=0;i<path.length();i++) {
			char dir=path.charAt(i);//access the path given path=WNEENESENNN
			
			if(dir=='S') {
				y--;
			}
			else if(dir=='N') {
				y++;
			}
			else if(dir=='E') {
				x++;
			}
			else {
				x--;
			}
		}
		
		int x2=x*x;
		int y2=y*y;
	    return (float)Math.sqrt(x2+y2);	
		}
	
	public static void main(String args[]) {
		String path="WNEENESENNN";
		System.out.println(getshortestpath(path));
		
	}

}

