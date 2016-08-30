package h6_firstrepeated;

public class h6_firstrepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,1,2,16,16,29,13,13};
		int[] b=new int[a.length];
		int p=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					//System.out.println(a[i]);
					b[p]=a[i];
					p++;
					break;
				}
				
			}
		}
		System.out.println("First repeating is - "+b[0]);

	}

}
