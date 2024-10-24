package fileoperation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecode4 {

	public static void main(String[] args) throws IOException {
		String path1= "C:\\java full starck\\fileoperation\\Input3.txt";
		String path2="C:\\java full starck\\fileoperation\\Output3.txt";
		FileReader fr = new FileReader(path1);
		int temp;
		FileWriter fw = new FileWriter(path2);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		fw.close();
		fr.close();// TODO Auto-generated method stub

	}

}
