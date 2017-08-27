class Arr
{
	public static void main(String[] args)
	{
		int num[] ={1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int x:num)
		{
			System.out.println("value is :"+x);
			sum+=x;
			if(x==5)break;
		}
		System.out.println("Summation is :"+sum);
	}
}