package fileoperation;

import java.io.File;
import java.io.IOException;

public class filecode6 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\java full starck\\fileoperation\\Sample.txt");
		boolean res = f.createNewFile();
		System.out.println(res);
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		System.out.println(f.exists());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getFreeSpace());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());
		System.out.println(f.isAbsolute());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.isHidden());
		System.out.println(f.lastModified());
		System.out.println(f.length());
		// TODO Auto-generated method stub

	}

}
