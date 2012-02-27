/**
 * Each StateNode object is a state of the puzzle
 */
/**
 * @author LDS
 *
 */
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
	
	void print()
	{
		System.out.println(seq[0]+" "+seq[1]+" "+seq[2]);
		System.out.println(seq[3]+" "+seq[4]+" "+seq[5]);
		System.out.println(seq[6]+" "+seq[7]+" "+seq[8]);
	}
	
}
