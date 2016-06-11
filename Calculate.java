	import java.lang.Math.*;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	
public class Calculate{	
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		float answer = 0;
		String s;
		char[] chArray;
		
		
		while (true)
		{	
			String[] array = {"", "", ""};
			s = reader.readLine();
			if (s.equals("exit"))
			{	
				System.out.println("...........................................");
				System.out.println("Program finished");
				break;
			}
			else
			{
				chArray = s.toCharArray();
				int j = 0;
				int i = 0;
				while(i < s.length())
				{
					if (chArray[i] == ' ')
					{
						j+=1;
						i+=1;
						if (i == s.length())
							break;
					}
					array[j] = array[j] + chArray[i];
					i+=1;
				}
				if (j == 2)
					answer = Calculation(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]));
				else
					answer = Calculation(Math.round(answer), array[0], Integer.parseInt(array[1]));
				System.out.println("Result = " + answer);	
			}
		}
	}
	
	private static float Calculation(int a, String s, int b)
	{
		float res = 0;
		System.out.println("Calculating...");
		switch(s)
		{
			case "+":
				res = a + b;
				break;
			case "-":
				res = a - b;
				break;
			case ".":
				res = a * b;
				break;
			case "/": case ":":
				res = a / b;
				break;
			default: 
				res = 0;	
				break;
		}		
		return res;
	}
}
