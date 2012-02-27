/**
 * 
 */

/**
 * @author LDS
 * 8-puzzle game with solver and probably a problem generator.
 *Just for fun. 
 */

import java.lang.Object;
import java.util.Scanner;

public class EightPuzzle {

	public static final int [] goal = {0,1,2,3,4,5,6,7,8};
	public static final StateNode Goal= new StateNode (goal);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to world of 8 puzzle!");
		System.out.println("Solving the puzzle below with the 0 indicating space");
		System.out.println("Type in the block number you want to move at each step.");
		StateNode sn = generator();
		
		Scanner scanner = new Scanner(System.in);
		boolean flag=true;
		String help="I give up.";
		
		while(flag)
		{
		sn.print();
		System.out.println("Type "+help+" to see solution."); 
		int nextmove= scanner.nextInt();
		if (nextmove!=0)
		{
			operate(nextmove);
			if (sn.rel==0)
			{
				flag=false;
				System.out.println("Congratulations!!");
			}
		}
		else
		{
			String str=scanner.nextLine();
			if (str.equals(help)) 
			{
				flag=false;
				//solve
				//print solve
			}
			else
				System.out.println("Invalid input");			
		}
		}
		
	}
	
	public static StateNode generator()
	{
		StateNode sn;
		//check if solvable by calculating the odd or even
		if (solver.isSolvable(sn));
		return sn;
	}
	
	public static void operate(int nextmove){
		//make movement according to user input
	}
	
}
