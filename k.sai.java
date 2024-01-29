class test
{
	public static void main(String args[])
	{
		int num=10,rem=0,sum=0,mul;
		mul=num*num;
		while(mul>0)
		{
			rem=mul%10;
			mul=mul/10;
			sum=sum+rem;
			
		}
		if(sum==num)
		System.out.println("Evil number");
		else
		System.out.println("not Evil number");
	}
}

class power
{
	public static void main(String args[])
	{
		int num=132,rem=0,sum=0,mul=1;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
			mul=mul*rem;
		}
		if(sum==mul)
		System.out.println("power number");
		else
		System.out.println("non-power number");
	}
}

class automation
{
	public static void main(String args[])
	{
		int num=76,rem=0,sum=0,mul,x=num,count=0;
		mul=num*num;
		while(mul>0)
		{	count++;
			rem=mul%100;
			sum=sum+rem;
			mul=mul/100;
		}
		if(count==1)
		{
			System.out.println(sum);
		}
	}
}


class technology
{
	public static void main(String args[])
	{
		int num=2025,rem=0,sum=0,mul,x=num;
		while(num>0)
		{	
			rem=num%100;
			sum=sum+rem;
			num=num/100;		
		}
		System.out.println(sum);
		mul=sum*sum;
		if(mul==x)
		System.out.println("technology number");
		else
		System.out.println("non-technology number");
	}
}

