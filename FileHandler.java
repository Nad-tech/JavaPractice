import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CreateFile {
	CreateFile(String fName) {
		try {
			File f = new File(fName);
			if(f.createNewFile()) {
				System.out.println(fName + " created!");
			}
			else {
				System.out.println(fName + " already exists!");
			}
		}
		catch (IOException e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
	}
}

class WriteToFile {
	WriteToFile(String fName, String text) {
		try {
			File f = new File(fName);
			if(f.isFile()) {
				FileWriter fileWriter = new FileWriter(fName);
				fileWriter.write(text);
				fileWriter.close();
			}
			else {
				System.out.println(fName + " does not exist!");
			}
		}
		catch (IOException e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
	}
}

class ReadFile {
	ReadFile(String fName){
		try {
			File f = new File(fName);
			Scanner reader = new Scanner(f);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
	}
}

class DeleteFile {
	DeleteFile(String fName) {
		File f = new File(fName);
		if(f.delete()) {
			System.out.println("Deleted " + fName);
		}
		else {
			System.out.println("Did not delete " + fName);
		}
	}
}

class FileHandler {
	public static void main(String[] args) {
		String s = "";
		s = s.concat("FARTSFARTSFARTSFARTSFARTSFARTS\n");
		s = s.concat("FARTSFARTSFARTSFARTSFARTSFARTS\n");
		s = s.concat("FARTSFARTSFARTSFARTSFARTSFARTS\n");
		s = s.concat("FARTSFARTSFARTSFARTSFARTSFARTS\n");
		s = s.concat("FARTSFARTSFARTSFARTSFARTSFARTS\n");
		s = s.concat("FARTSFARTSFARTSFARTSFARTSFARTS\n");
		s = s.concat("FARTSFARTSFARTSFARTSFARTSFARTS\n");
		s = s.concat("FARTSFARTSFARTSFARTSFARTSFARTS\n");
		s = s.concat("FARTSFARTSFARTSFARTSFARTSFARTS\n");
		
		CreateFile cF = new CreateFile("FARTS");
		WriteToFile wF = new WriteToFile("FARTS", s);
		ReadFile rF = new ReadFile("FARTS");
		DeleteFile Df = new DeleteFile("FARTS");
	}
}