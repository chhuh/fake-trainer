
/**
 * ExerciseInfo Ŭ������ �ϳ��� � ����(��̸�,�⺻Ƚ��,�⺻�ð�,Į�θ�����,URL)�� �����ϱ� ���� �ʿ��� Ŭ�����̴�.
 * 
 * @author HUH CHANG-HYUN
 */
public class ExerciseInfo {
	
	String ExName; // Name of Exercise (�÷�ũ, ����Ʈ ��)
	int BaseCount; // Number of repetitions = BaseCount * Level
	int BaseTime;  // Limit time = BaseTime * Level
	int KcalPer;   // Kcal per 1 time
	String url;	   // URL for each ExName
	
	public ExerciseInfo(String ExName, int BaseCount, int BaseTime, int KcalPer, String url) {
		this.ExName=ExName;
		this.BaseCount = BaseCount;
		this.BaseTime = BaseTime;
		this.KcalPer = KcalPer;
		this.url = url;
	}
	
}
