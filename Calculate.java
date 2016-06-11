public class Calculate{
	public static void main(String[] args)
	{
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[2]);
		String s = args[1];
		float answer = Calculation(Integer.valueOf(args[0]), args[1], Integer.valueOf(args[2]));
		System.out.println("Result = " + answer);
		System.out.println("Done!");
	}
	
	private static float Calculation(int a; String s; int b)
	{
		float res = 0;
		System.out.println(a + " " + s + " "+ b);
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
