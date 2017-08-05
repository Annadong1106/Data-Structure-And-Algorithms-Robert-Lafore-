package InsertionSort;

public class ArrayIns
{
	private long[] arr;
	private int maxSize;
	private int nElems;
	
	ArrayIns(int size)
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
	
	public void insertionSort()
	{
		int in;
		int out;
		
		for(out = 1;out < nElems;out++)
		{
			in = out;
			long temp = arr[out];
			
			while(in > 0 && arr[in-1] > temp)   //注意此时比较的是arr[in-1]与temp的值
			{
				arr[in] = arr[in-1];
				in--;
			}
			
			arr[in] = temp;
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















