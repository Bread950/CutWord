package CutTheWord;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class Function {
	String inputPath="";
	String[] arr = null;
	public Function ()
	{
		
	}
	
	public void InputPath ()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("===== Analysis Path Program =====");
		System.out.println("Please input a path: " );
		inputPath = sc.nextLine();
		sc.close();
		String arr1 [] = inputPath.replace("\\", " ").split("\\s+");
		arr = arr1;
		//
	}
	public String getPath()
	{
		String path ="";
		for (int i=0; i<arr.length-1; i++)
		{
			 path = path + arr[i];
			if (i!=arr.length-2)
			path = path + "\\";
		}
		return path;
		
	}
	public String getFileName()
	{
		String fileWithExtesionArray  = arr[arr.length-1];
		String splitName []= fileWithExtesionArray.split("\\.");
		return splitName[0];
		
	}
	public String getExtension()
	{
		String fileWithExtesionArray  = arr[arr.length-1];
		String splitName []= fileWithExtesionArray.split("\\.");
		return fileWithExtesionArray;
		
	}
	public String getDisk()
	{
		return arr[0];
		
	}
	public String getFolders()
	{
		String folder ="";
		for (int i=1; i<arr.length-1; i++)
		{
			folder = folder + arr[i] ;
			if (i!=arr.length-2)
			folder= folder + "\\";
		}
		return "[" + folder + "]";
		
	}
}
