import java.util.ArrayList;

public class SharedData 
{
	//private int [] array;
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b; 
	
	/**
	 * Constructor for SharedData
	 * @param array
	 * @param b
	 */
	public SharedData(ArrayList <Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * Getter for winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Setter for winArray
	 * @param winArray to set
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Getter for winArray
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * Getter for b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Getter for flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Setter for flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
