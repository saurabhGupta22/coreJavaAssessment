package coreJava;

public class primeNumber {
	
	public static boolean isPrime(int a)
	{
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
		
	}
	
	public static int getSum(int a)
	{
		int tempp =a;
		int sum =0;
		while(tempp!=0)
		{
			sum += tempp%10;
			tempp =tempp/10;
		}
		//System.out.println("sum "+sum);
		return sum;
		
	}
	public static void main(String args[])
	{
		int arr[] ={2, 4, 6, 11, 12, 18, 7,21,23};
		for(int i=0;i<arr.length;i++)
		{
			int temp =arr[i];
			do
			{
				if(isPrime(temp))
					{
					    int tempp = getSum(temp);
					    if(isPrime(tempp))
						    {
					    		System.out.println(temp);
						    	temp =0;
						    }
					    temp =0;
					}
				else{
				    temp =0;
				}
			}
			while(temp!=0);
			
		}
		
		
	}
			

}
