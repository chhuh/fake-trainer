
import java.util.ArrayList;
import java.util.Calendar;
/**
 * Day Ŭ������ ������ �����ϱ� ���� Ŭ�����̴�.
 * '���� ����'����� addTodayExer() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  �ʱ��ۼ�
 * 		ANJIYOUNG, 1.0.1, 2020.12.26
 * 
 * @author ANJIYOUNG
 * @version 1.0.1 2020.12.26
 */
public class Day {
	
	private int year;
	private int month;
	private int date;
	
	private ArrayList<TodayExer> exerList = new ArrayList<TodayExer>(); // �Ϸ絿�� ������ ������� ����
<<<<<<< HEAD
	private int exerNum;    // exerList�� ������
=======
	private int exerNum;    // �Ϸ絿�� ������ ������� ����
>>>>>>> 7af0be90c448cfb2c0bc3ec22899b80e36ac8335
	private int calorieSum; // �Ϸ絿�� �Ҹ��� �� Į�θ�
	
	public Day() {
		Calendar cal = Calendar.getInstance();
		this.year = cal.get(Calendar.YEAR);
		this.month = cal.get(Calendar.MONTH) + 1;
		this.date = cal.get(Calendar.DATE);
		this.exerNum = 0;
		this.calorieSum = 0;
	}
	
	public TodayExer getExerList(int index) {
		return exerList.get(index);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public int getExerNum() {
		return exerNum;
	}

	public int getCalorieSum() {
		return calorieSum;
	}

	/**
	 * �Ϸ絿�� ������ � ���(exerList)�� TodayExer ��ü�� �߰��Ѵ�.
	 * �Ϸ絿�� �Һ��� Į�θ� ����(calorieSum)�� ������Ʈ�Ѵ�.
	 * 
	 * @param exer ������ �����(�����+��̸�+Į�θ�����)
	 */
	public void addTodayExer(TodayExer exer) {
		exerList.add(exer);
		exerNum++;
		calorieSum += exer.getCalorie();
	}

}
