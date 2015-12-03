public class ZeroRowZeroColum{
	static int [][]zeroMatrix(int [][]matr){
		int foundRow = 0;
		int foundColum = 0;
		int [][]copyMatr=matr;
		for(int i=0;i<matr.length;i++)
			for(int j=0;j<matr[0].length;j++){
				if(matr[i][j]==0){
					System.out.println("Inside");
					foundRow=i;
					foundColum=j;
					for(int x=foundRow;x<matr.length;x++)
						copyMatr[x][foundColum]=0;
					for(int y=0;y<matr[0].length;y++)
						copyMatr[foundRow][y]=0;
					foundRow=0;
					foundColum=0;
				}
			}
		return copyMatr;
	}
	public static void main(String []args){
		int [][]matr = {{1,2,0,3},
						{2,3,4,5},
						{0,1,3,6}};
		int [][]matrZero = zeroMatrix(matr);
		for(int i=0;i<matrZero.length;i++){
			for(int j=0;j<matrZero[0].length;j++){
				System.out.print(matrZero[i][j]+" ");
			}
			System.out.println();
		}

	}
}