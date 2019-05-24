import java.io.*;
class SimiTest
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("ご用件は何でしょうか？");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println("要件は" + str + "ですね。");	
	}
}