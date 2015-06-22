
public class TwoDArr {
	public static void main(String[] args) 
	{ 
		/*declare 2D_Array */
		String[][] arr=new String[][]{{"INDIA:","bbsr","hyd","che","mum","del"},
				{"CHINA:","chi","chu","cha","haa","hoo"},
				{"slk:","x","y","z","A","B"},
				{"pak:","C","D","E","F","G"},
				{"aus:","L","K","J","I","H"},
				{"nzl:","M","N","0","P","Q"},
				{"sa:","V","U","T","S","R"},
				{"US:","W","AA","BB","CC","DD"},
				{"ENG:","II","HH","GG","FF","EE"},
				{"BNG:","JJ","KK","LL","MM","NN"}};
		for(int i=0;i<arr.length;i++) /*for loop for print the 2D Array*/ 
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
