package binarySearch;

/*
此次相对于HighArray来说，在find()方法中运用了折半查找法
注意折半查找法只适用于OrderedArray,即排序后的数组
*/

public class OrdArray 
{	
	private long[] arr;
	private int maxSize;
	private int nElems;
	
	OrdArray(int size)
	{
		maxSize = size;
		arr = new long[maxSize];
		nElems = 0;
	}
	
	public int size()
	{
		return nElems;
	}
	
	public void insert(long value)   //将插入的数按升序排序
	{
		int i;
		
		for(i = 0;i < nElems;i++)
		{
			if(arr[i] > value)
				break;
		}
		
		int j;
		
		for(j = nElems - 1;j >= i;j--)
		{
			arr[j+1] = arr[j];
		}
		
		arr[i] = value;
		nElems++;
	}	
	
	
	public int find(long searchKey)  //binary search,返回元素下标
	{
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;
		
		while(true)
		{
			curIn = (lowerBound + upperBound)/2;
			
			if(arr[curIn] == searchKey)
				return curIn;
			else if(lowerBound > upperBound)
				return nElems;    //表示没有找到searchKey
			else
			{
				if(arr[curIn] > searchKey)
					upperBound = curIn - 1;
				else
					lowerBound = curIn + 1;
			}
		}
	}
	
	public boolean delete(long searchKey)
	{
		int i = find(searchKey);
		
		if(i == nElems)      //没有找到searchKey
			return false;
		else
		{
			int j;
			
			for(j = i;j < nElems-1;j++)
			{
				arr[j] = arr[j+1];                 //注意此时不可写成arr[j-1] = arr[j];因为要考虑到删除第一个元素的情况
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










