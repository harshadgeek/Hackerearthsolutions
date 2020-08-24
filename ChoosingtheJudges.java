import java.util.Scanner;

public class ChoosingtheJudges {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases>0)
		{
			int size= sc.nextInt();
			int[] arrayOfScores = new int[size];
			for(int i=0;i<size;i++)
			{
				arrayOfScores[i]=sc.nextInt();
			}
				System.out.println("Case "+testCases+":"+getMaxScore(arrayOfScores));
			
			testCases--;
		}

	}

	public static int getMaxScore(int[] array)
	{
		int max=0;
		if(array.length==1)
		{
			return array[0];
		}
		
		int[] tempArray = new int[array.length];
		tempArray[0]=array[0];
		tempArray[1]= Math.max(tempArray[0], array[1]);
		max= tempArray[1];
		for(int i=2;i<array.length;i++)
		{
			tempArray[i]=Math.max(tempArray[i-2]+array[i],tempArray[i-1]);
			if(tempArray[i]>max)
			{
				max=tempArray[i];
			}
		}
		return max;
	}
	
	
}
