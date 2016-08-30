package h10_subset;

public class h10_subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,3,5};
		int[] b={1,2,3,4,5};
		int cnt=0;
		
		if(a.length<b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						//System.out.println(a[i]);
						cnt++;
					}
				}
			}
			if(cnt==a.length)
			{
				System.out.println("a is the subset of b");
			}
			else
			{
				System.out.println("a is not the subset of b");
			}
		}
		else
		{
			System.out.println("reverse the size of the string");
		}
		
	

	}

}
