package fileoperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecode5 {

	public static void main(String[] args) throws IOException {
		String path1= "C:\\java full starck\\fileoperation\\Input4.txt";
		String path2="C:\\java full starck\\fileoperation\\Output4.txt";
		FileReader fr = new FileReader(path1);
		BufferedReader br = new BufferedReader(fr);
		int temp;
		FileWriter fw = new FileWriter(path2);
		BufferedWriter bw = new BufferedWriter(fw);
		while((temp=br.read())!=-1);{
			bw.write(temp);
		}
		fw.close();
		fr.close();
		bw.close();
		br.close();

	}

}
