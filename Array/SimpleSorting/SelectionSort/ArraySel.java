package SelectionSort;

/*
用selectionSort()方法将数组进行升序排序
*/

public class ArraySel
{
	private long[] arr;
	private int nElems;
	private int maxSize;
	
	ArraySel(int size)
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
	
	public void selectionSort()
	{
		int in;
		int out;
		int min;    //存放放最小值的下标
		
		for(out = 0;out < nElems;out++)
		{
			min = out;     //假设每次循坏，最小值是下标为out的元素
			
			for(in = out+1;in < nElems;in++)
			{
				if(arr[in] < arr[min])
					min = in;        //如果当前值比arr[min]小，则将当前下标赋给min
			}
			
		    //将挑选出来的最小值与arr[out]交换
            long temp = arr[min];
            arr[min] = arr[out];
            arr[out] = temp;
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






