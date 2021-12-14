import utils.FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DayOne
{
	public static void main(String[] args)
	{
		partOne();
		partTwo();
	}

	private static void partOne()
	{
		File input = new FileIO().getFileFromResource("day1.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(input))) {
			String line;
			int num;
			int prevNum = -1;
			int count = 0;

			while ((line = br.readLine()) != null) {
				num = Integer.parseInt(line);
				if (prevNum != -1)
					if (prevNum < num)
						count++;

				prevNum = num;
			}

			System.out.println("\n\nThere are " + count + " measurements that were larger than the previous!\n\n");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private static void partTwo()
	{
		File input = new FileIO().getFileFromResource("day1.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(input))) {
			List<Integer> listOfSums = new ArrayList<>();

			String line;
			int num;
			int prevPrevNum = -1;
			int prevNum = -1;
			int count = 0;

			while ((line = br.readLine()) != null) {
				num = Integer.parseInt(line);
				if (prevPrevNum != -1)
					if (prevNum != -1)
						listOfSums.add(prevPrevNum + prevNum + num);

				prevPrevNum = prevNum;
				prevNum = num;
			}

			int prevSum = -1;
			for (int sum: listOfSums)
			{
				if (prevSum != -1)
					if (prevSum < sum)
						count++;

				prevSum = sum;
			}

			System.out.println("\n\nThere are " + count + " measurements that were larger than the previous!\n\n");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
