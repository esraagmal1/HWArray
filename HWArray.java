//split array to odd and even and find the avarege to each arrays

public class HWArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Arr = {1,2,3,4,5,6,7,8,9,10};
		int [] ArrOdd=new int [5];
		int [] ArrEven=new int [5];
		int c=0;
		int cOdd=0;
		int cEven=0;
		int avg=0;
		int avgOdd=0;
		int avgEven=0;
		
		for(int i=0; i < Arr.length; i++)
		{			
			// use mod of 2 to find if the number is an even number
			if(Arr[i]%2 == 0)
			{				
				ArrEven[cEven] = Arr[i];	
				avgEven+=ArrEven[cEven];
				cEven++;
			} 
			else 
			{			
				ArrOdd[cOdd] = Arr[i];
				avgOdd+=ArrOdd[cOdd];
				cOdd++;
			}
			avg+=Arr[i];
			c++;
		}
		//printing
		System.out.println("All Numbers:  ");
		for (int i=0; i<Arr.length;i++)
		{
			System.out.print(Arr[i]+" , ");
		}
		System.out.println("  ");
		System.out.println("The Avareg of numbers is  "+avg/c);
		
		System.out.println(" Odd Numbers: ");
		for (int i=0; i<ArrOdd.length;i++)
		{
			System.out.print(ArrOdd[i]+" , ");
		}
		System.out.println("  ");
		System.out.println("The Avareg of Odd numbers is  "+avgOdd/cOdd);
		
		System.out.println("Even Numbers:  ");
		for (int i=0; i<ArrEven.length;i++)
		{
			System.out.print(ArrEven[i]+" , ");
		}
		System.out.println("  ");
		System.out.println("The Avareg of Odd numbers is  "+avgEven/cEven);

	}

}
