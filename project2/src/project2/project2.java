package project2;

import java.util.Scanner;

public class project2 {
	public static void main(String args[])
	{
		int count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String str = sc.nextLine();
		for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
		System.out.print("Words in the sentence are: \n");
		String[] arr = str.split(" ");
		for(String s: arr) {
			System.out.println(s);
		}
		System.out.print("total number of words: " +count);
	}

}
