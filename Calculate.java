public class Calculate{
	public static void main(String[] args)
	{
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[2]);
		String s = args[1];
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
		System.out.println("Result = " + res);
		System.out.println("Done!");
	}
}
