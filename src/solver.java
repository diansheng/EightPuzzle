import java.util.*;
class solver {
	
	Stack step;//
	Stack select;
	//Constructor
	public solver(){}
	
	//Solve the problem
	public static void solve (){}
	
	//Print out the solution by steps.
	public void printSolution(){}
	
	//check if solvable by calculating the odd or even
	public static boolean isSolvable(StateNode sn){
		int count=0;
		for (int i=0;i<8;i++)
			for (int j=i+1;j<=8;j++)
				count=sn.seq[i]>sn.seq[j]?count+1:count;
		return true;//(count%2==0);
	}	
	
}
