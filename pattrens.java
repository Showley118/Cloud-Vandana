package Pattrens;

public class pattrens {
    public static void main(String[] ars) {
    	
    	int n = 5;
    	for(int i=1;i<=n;i++ ) {
        	for(int j=n-1;j>0;j--) {
    			System.out.print(" ");
    		}
        	
    	    for(int j=1;j<=i;i++) {
    		      System.out.println("*");
    	    }
    	   System.out.println();
    	}
    }
}
