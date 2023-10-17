package Arreys1;

public class Arreys6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int [][] pics = new int [4][5];
		      
		      // 0 1 2 3 
		      // 0 1 2 3 4
		      
		      pics[0][0] = 110;
		      pics[0][1] = 210;
		      pics[0][2] = 310;
		      pics[0][3] = 410;
		      pics[0][4] = 510;
		     
		      pics[1][0] = 610;
		      pics[1][1] = 710;
		      pics[1][2] = 810;
		      pics[1][3] = 910;
		      pics[1][4] = 510;
		      
		      pics[2][0] = 130;
		      pics[2][1] = 140;
		      pics[2][2] = 150;
		      pics[2][3] = 160;
		      pics[2][4] = 110;
		      
		      pics[3][0] = 170;
		      pics[3][1] = 180;
		      pics[3][2] = 190;
		      pics[3][3] = 220;
		      pics[3][4] = 110;
		      
		   for(int i = 0;i<pics.length; i++) {
			   for(int j =0;j<pics[i].length;j++) {
				   
				   System.out.print(pics[i][j] +" ");
			   }
			   System.out.println();
		   }

	}

}
