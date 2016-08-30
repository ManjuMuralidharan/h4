package h9_closesttozero;

public class h9_closesttozero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={-3,-1,1,5,6};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					sum=a[i]+a[j];
					if(sum==0)
					{
						System.out.println("Closest to zero - "+a[i]+" "+a[j]);
					}
				}
			}
		}

	}

}
