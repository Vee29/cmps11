// Problem5.java
class problem5{
	public static void main(String[] args){
		int[][] A = {{2, 4},{5, -1}};
		int[][] B = {{5, 3},{-3, 2}};
		//System.out.println(f(A));
		//h(B);
		h(g(B));
		System.out.println(f(g(B)));
		//h(g(A));
	}
	static int f(int[][] M){
		return M[0][0]*M[1][1]-M[0][1]*M[1][0];
	}
	static int[][] g(int[][] M){
		int[][] N = new int[2][2];
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
				N[i][j] = M[j][i];
			return N;
		}
		static void h(int[][] M){
			for(int i=0; i<2; i++){
				for(int j=0; j<2; j++)
					System.out.print(M[i][j]+" ");
				System.out.println();
			}
		}
	}