/**
 * Each StateNode object is a state of the puzzle
 */
/**
 * @author LDS
 *
 */
import java.lang.Math;

public class StateNode {
	
	public int [] seq;//seq stands for sequence/ current arrangement
	int rel;//rel stands for relevence
	int space;//index of the empty space
	//constructor
	public StateNode(int [] seq){
		//if seq.length==9;
		this.seq=seq;
		rel=difference(EightPuzzle.Goal);
	}
	
	public StateNode(int [] seq, int index){
		//if seq.length==9;
		this.seq=seq;
		rel=difference(EightPuzzle.Goal);
		space=index;
	}
	
	//tell how many digits different of two states
	public int difference(StateNode sn)
	{
		int count=0;
		for (int i=0;i<9;i++)
			count=this.seq[i]==sn.seq[i]?count:count+1;
		return count;
	}
	
	//make movement according to user input	
	public void operate(int nextmove){
		int pos0, pos_nextmove;//index number of 0 and nextmove
		for(int i=0;i<9;i++)
		{
			if(arr[i]==0) 
			{
				pos0=i;
				continue;
			}
			if(arr[i]==nextmove)
			{
				pos_nextmove==i;
				continue;
			}
		}
		int diff=Math.abs(pos0-pos_nextmove);
		if (diff==1||diff==3)
		{
			seq[pos0]=seq[pos_nextmove];
			seq[pos_nextmove]=0;
		}
		print();
	}
	
	void print()
	{
		System.out.println(seq[0]+" "+seq[1]+" "+seq[2]);
		System.out.println(seq[3]+" "+seq[4]+" "+seq[5]);
		System.out.println(seq[6]+" "+seq[7]+" "+seq[8]);
	}
	
}
