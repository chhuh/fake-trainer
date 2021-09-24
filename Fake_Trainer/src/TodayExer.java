
/**
 * TodayExer Ŭ������ ������ ������� ǥ���ϴ� Ŭ�����̴�.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  �ʱ��ۼ�
 * 		ANJIYOUNG, 1.0.1, 2020.12.26
 * 
 * @author ANJIYOUNG
 * @version 1.0.1 2020.12.26
 */
public class TodayExer {
	
	private String exPart; // exercise part: �����	
	private String exName; // exercise name: ��̸�
	private int calorie;   // calorie: Į�θ����� 
	
	public TodayExer() {

	}
	
	public TodayExer(String exPart, String exName, int calorie) {	
		this.exPart = exPart;
		this.exName = exName;
		this.calorie = calorie;
	}
	
	public String getExPart() {
		return exPart;
	}

	public String getExName() {
		return exName;
	}

	public int getCalorie() {
		return calorie;
	}
	
}
