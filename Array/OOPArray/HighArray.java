/*
 * 用面向对象的思想来解释数组和理解分离data Structure 和 user
 * */
package OOPArray;

public class HighArray 
{	
	private long[] arr;
	private int maxSize;
	private int nElems;
	
	HighArray(int size)
	{
		maxSize = size;
		arr = new long[maxSize];
		nElems  = 0;
	}
	
	public void insert(long value)   //在升序排序的数组中插入数据
	{
		int i;
		
		for(i = 0;i < nElems;i++)
		{
			if(arr[i] > value)          //找到插入的位置
				break;
		}
		
		int j;
		
		for(j = nElems - 1;j >= i ;j--)
		{ 
			arr[j+1] = arr[j];         //从value插入位置开始，将元素均向后移
 		}
		
		arr[i] = value;              //将value插入
		
		nElems++;
	}
	
	
	public boolean find(long searchKey)
	{
		int i;
		
		for(i = 0;i < nElems;i++)
		{
			if(arr[i] == searchKey)
				break;
		}
		
		if(i == nElems)
			return false;
		else
			return true;
	}
	
	public boolean delete(long searchKey)
	{
		int i;
		
		for(i = 0;i < nElems;i++)
		{
			if(arr[i] == searchKey)
				break;
		}
		
		if(i == nElems)
			return false;
		else             //将后面元素向前移动
		{
			int j;
			
			for(j = i;j < nElems - 1;j++)
			{
				arr[j] = arr[j+1];         //必须这样写
			}
			nElems--;
			return true;
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








