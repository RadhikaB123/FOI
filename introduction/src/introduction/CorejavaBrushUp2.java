package introduction;

import java.util.ArrayList;

public class CorejavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]arr2= {1,2,3,4,5,6,7,8,9,10,122};
		
		for(int i=0;i<arr2.length;i++)
		{
			if (arr2[i]%2==0)
			{
				System.out.println(arr2[i]);
			}
			else
			{
			   System.out.println(arr2[i]+"is not multiple of 2");	
			}
		}
		ArrayList a= new ArrayList<String>();
		a.add("radhika");
		a.add("bhoi");
		a.add("selenium");
		System.out.println(a.get(1));

	}

}
