import utils.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DayZero
{
	public static void main(String[] args)
	{
		partOne();
		partTwo();
	}

	private static void partOne()
	{
		File input = new FileIO().getFileFromResource("day0.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(input)))
		{
			// process input here

			System.out.println("\n\nHere is the answer!\n\n");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private static void partTwo()
	{
		File input = new FileIO().getFileFromResource("day0.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(input)))
		{
			// process input here

			System.out.println("\n\nHere is the answer!\n\n");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}