import java.util.Scanner;

public class MagicalWord
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int word[] = { 67,71,73,79,83,89,97,101,103,107,109,113};
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j = 0; j<t;j++){
			int sol = 67;
			sc.nextInt();
			char[] arr = sc.next().toCharArray();
			for(char ch:arr){
				int diff = 400;
				for(int i = 0; i<word.length;i++){
					int tDiff = Math.abs(ch-word[i]);
					if(tDiff<diff){
						sol = word[i];
						diff = tDiff;
					}
					
				}
				System.out.print((char)sol);
				
			}
			
			System.out.println(); 
		}
	}
