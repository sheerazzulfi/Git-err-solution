class Question9
{
	public static int maxmod(int a, int b)
	{
		int res=0;

		if (a%5==b%5) 
		{
			if (a<b) 
			{
				res=a;
			}
			else
				res=b;
		}
		else if (a==b) 
		{
			res=0;
		}

		else if (a>b) 
		{
			res=a;
		}
		else
			res=b;



		return res;
	}
	public static void main(String[] args) 
	{
		int ans;
		ans=maxmod(3,2);
		System.out.println(ans);
	}
}