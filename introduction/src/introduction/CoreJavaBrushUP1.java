package introduction;

public class CoreJavaBrushUP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		String website = "radhika";
		char letter = 'r';
		double dec = 5.99;
		boolean mycard= true;
		
		
		System.out.println(num);
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(mycard);
		
		
		//Arrays -
		int[]arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2= {1,2,3,4,5,6};
		System.out.println(arr2[3]);

		
		//for loop arr.length - 5
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
//		for (int i=0; i<arr.length;i++)
//		{
//			System.out.println(arr2[i]);
//		}
		String[]name= {"radhika","bhoi","selenium"};
		for (int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}
//		for (String s:name)
//		{
//			System.out.println(s);
//			
//		}
		
	}

}
