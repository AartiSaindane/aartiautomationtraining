package prgmtest;

public class ArrayPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] arr=new int[5][2];
		
		arr[0] [0]= 100 ;
		arr[0] [1]= 99;
		
		arr[1] [0]= 98;
		arr[1] [1]= 97;
		
		arr[2] [0]= 96;
		arr[2] [1]= 95;
		
		arr[3] [0]= 94;
		arr[3] [1]= 93;
		
		arr[4] [0]= 92;
		arr[4] [1]=91;
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
