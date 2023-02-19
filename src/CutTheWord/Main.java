package CutTheWord;

public class Main {
	public static void main (String [] args)
	{
	Function function = new Function ();
	function.InputPath();
	System.out.println("----- Result Analysis -----");
	System.out.println("Disk: " + function.getDisk());
	System.out.println("Extension: " + function.getExtension());
	System.out.println("File name: " + function.getFileName());
	System.out.println("Path: " + function.getPath());
	System.out.println("Folders: " + function.getFolders());
		System.out.println("Butter");
		System.out.println("This is a change");
		System.out.println("Bread");
		System.out.println("Sugar");
	}
}
