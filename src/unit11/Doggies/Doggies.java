package unit11.Doggies;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		
	}
	
	public void set(int spot, int age, String name)
	{
            //put a new Dog in the array at spot 
            //make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
            String old = "";
            for (int i = 0; i < pups.length; i++)
            {
                
            }
            return old;
	}

	public String getNameOfYoungest()
	{
            String young = "";
            for (int i = 0; i < pups.length; i++)
            {
                
            }
            return young;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}