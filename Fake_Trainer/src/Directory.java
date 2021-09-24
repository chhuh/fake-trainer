
import java.io.File;
/**
 * Directory Ŭ������ ���丮 Ȯ�� �� ������ ���� Ŭ�����̴�.
 * '���丮 Ȯ��'����� existDirectory() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * '���丮 ����'����� makeDirectory()  �޼ҵ带 ����Ͽ� �����Ѵ�.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  �ʱ��ۼ�
 * 		ANJIYOUNG, 1.0.1, 2020.12.24
 * 
 * @author ANJIYOUNG
 * @version 1.0.1 2020.12.24
 */
public class Directory {
	
	private String rootPath; // ���� �۾� ���
	private String path;	 // ���丮 ���
	private String dirName;  // ���丮 �̸�
	
	public Directory() {
		
	}
	
	public Directory(String dirName) {
		File file = new File(".");
		rootPath = file.getAbsolutePath();
		path = rootPath + "\\" + dirName;
		this.dirName = dirName;
	}
	
	public String getPath() {
		return path;
	}

	public String getDirName() {
		return dirName;
	}
	
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	/**
	 * 'path'��ο� 'dirName'���丮�� �����ϴ��� Ȯ���Ѵ�.
	 */
	public boolean existDirectory() {
		File dir = new File(path);
		if (dir.exists()) 
			return true;
		else 
			return false;
	}
	
	/**
	 * 'path'��ο� 'dirName'���丮��  �����Ѵ�.
	 */
	public void makeDirectory() {
		File dir = new File(path);
		if (!dir.exists())
			dir.mkdir(); // If the directory does not exist, create a directory.
	} 
	
}
