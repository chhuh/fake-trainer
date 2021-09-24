
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * FileOP Ŭ������ �ؽ�Ʈ ���� ������ ���� �� �б⸦ ���� Ŭ�����̴�.
 * '���� ����'����� makeFile()  �޼ҵ带 ����Ͽ� �����Ѵ�.
 * '���� ����'����� writeFile() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * '���� �б�'����� readFile()  �޼ҵ带 ����Ͽ� �����Ѵ�.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  �ʱ��ۼ�
 * 		ANJIYOUNG, 1.0.1, 2020.12.25
 * 
 * @author ANJIYOUNG
 * @version 1.0.1 2020.12.25
 */
public class FileOP extends Directory {

	public FileOP() {
	
	}
	
	public FileOP(String name) {
		super(name);
	}

	/**
	 * 'date'������ �̸����� �ϴ� �ؽ�Ʈ ������ �����Ѵ�.
	 * 
	 * @param  date ��¥����
	 * @return ������ �ؽ�Ʈ ������ ���۷���
	 */
	private File makeFile(String date) {
		String fileName = date + ".txt";
		String filePath = super.getPath() + "\\" + fileName;
		File file = new File(filePath);
		return file;
	}

	/**
	 * ���丮���� 'date'�ؽ�Ʈ ������ ã��(���ٸ� ���� ����)
	 * ���Ͽ� 'userLog'������ ����.
	 * 
	 * @param date ��¥����
	 * @param userLog �Ϸ� ����
	 * @exception IOException ���Ϸ� ����� �� ���� ���,���ҽ� Ŭ��� ������ ���
	 */
	public void writeFile(String date, String userLog) {
		File file = makeFile(date);
		try(FileWriter fw = new FileWriter(file, true)) {
			fw.write(userLog);
			fw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 'userName'���丮���� 'date'�ؽ�Ʈ ������ ã��
	 *  ��ü ���ϳ����� ���پ� �о ����Ѵ�.
	 * 
	 * @param userName ������̸�
	 * @param date	       ��¥����
	 * @exception FileNotFoundException FileReader�� ���ڰ� ���丮�̰ų� ������ �������� �ʴ� ���
	 * @exception IOException <BufferedReader���� �߻�>,���ҽ� Ŭ��� ������ ���
	 */
	public void readFile(String userName, String date) {
		File dir = new File(super.getPath());		
		if (dir.exists()) {
			String fileName = date + ".txt";
			String filePath = getPath() + "\\" + fileName;
			File file = new File(filePath);
			
			if (file.exists()) { // read the file!
				try(FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr)) {
					String line = "";
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else
				System.err.println(fileName + " ������ �������� �ʽ��ϴ�.");
		} else
			System.err.println(userName + " ���丮�� �������� �ʽ��ϴ�.");
	}

}
