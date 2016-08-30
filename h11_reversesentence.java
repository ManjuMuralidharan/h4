package h11_reversesentence;

public class h11_reversesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is a sample sentence";
		String[] ss=s.split(" ");
		String[] s1=new String[ss.length];
		int c=s1.length;
		int len=ss.length;
		
		
			for(int i=0;i<ss.length;i++)
			{
				s1[c-1]=ss[i];
				c--;
			}
		
		for(int j=0;j<s1.length;j++)
		{
			System.out.println(s1[j]);
		}

	}

}
