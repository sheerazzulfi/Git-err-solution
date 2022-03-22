{
	public static boolean lastdigit(int a, int b, int c)
	{
		boolean res=true;
		if (a%10==b%10 || b%10==c%10 || a%10==c%10) 
		{
			res= true;
		}
		else 
			res=false;

		return res;
	}

	public static void main(String[] args) 
	{
		boolean ans;
		ans=lastdigit(23,19,3);
		System.out.println(ans);
	}
}