package BubbleSort;

/*
将BubbleSort算法包装在数组中，成为数组一部分，而不是在主类中体现，值得学习
*/
public class ArrayBub
{
	private long[] arr;
	private int maxSize;
	private int nElems;
	
	ArrayBub(int size)
	{
		maxSize = size;
		arr = new long[maxSize];
		nElems = 0;
	}
	
	public void insert(long value)
	{
		arr[nElems] = value;
		nElems++;
	}
	
	public void bubbleSort()
	{
		int in;
		int out;
		
		for(out = nElems - 1;out >= 1;out--)
		{
			for(in = 0;in < out;in++)
			{
				if(arr[in] > arr[in+1])
				{
					long temp = arr[in];
					arr[in] = arr[in+1];
					arr[in+1] = temp;
				}
			}
		}
	}
	
	public void display()
	{
		int i;
		
		for(i = 0;i < nElems;i++)
		{
			System.out.print(arr[i] + "  ");
		}
		
		System.out.println();
	}
}
