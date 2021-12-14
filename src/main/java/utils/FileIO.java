package utils;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class FileIO
{
	public File getFileFromResource(String fileName)
	{
		File file;
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(fileName);

		try
		{
			if (resource == null)
			{
				System.out.println("file not found! " + fileName);
				return null;
			}
			else
				file = new File(resource.toURI());
		}
		catch (URISyntaxException e)
		{
			e.printStackTrace();
			return null;
		}

		return file;
	}
}
