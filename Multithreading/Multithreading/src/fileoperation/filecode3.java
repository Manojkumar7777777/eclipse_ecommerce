package fileoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filecode3 {

	public static void main(String[] args) throws IOException {
		String path1 = "C:\\java full starck\\fileoperation\\Input2.txt";
		String path2="C:\\java full starck\\fileoperation\\Output2.txt";
		FileInputStream fis = new FileInputStream(path1);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		while ((temp=fis.read())!=0) {
			fos.write(temp);
			
			
		}
		fos.close();
		fis.close();// TODO Auto-generated method stub

	}

}
