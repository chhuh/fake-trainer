
import java.util.*;
/**
<<<<<<< HEAD
 * Part Ŭ������ Ư�� ������ ����� ��� �����ϱ� ���� �ʿ��� Ŭ�����̴�.
=======
 * Part Ŭ������ Ư�� ������� �ش��ϴ� ����� ���� �α� ���� �ʿ��� Ŭ�����̴�.
>>>>>>> 7af0be90c448cfb2c0bc3ec22899b80e36ac8335
 * '������� � �߰�'����� AddExerciseInfo() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * 
 * @author LEE JAE-HYUB
 */
public class Part {
	
	String BodyName;	// BodyName (��, ����, �ھ� ... )
	// List of Exercise for given BodyName( BodyName:�ھ�, ExInfoList: [�a��ũ, ����Ʈ �÷�ũ, ...] )
	List <ExerciseInfo> ExInfoList = new ArrayList<ExerciseInfo>();
	
	public Part(String BodyName) {
		this.BodyName = BodyName;
	}
	
	/**
	 * �ϳ��� ExerInfo�� PartŬ���� ������ ExInfoList�� �߰��Ѵ�.
	 */
	public void AddExerciseInfo(String ExName, int BaseCount, int BaseTime, int KcalPer, String url) {
		ExerciseInfo e = new ExerciseInfo(ExName, BaseCount, BaseTime, KcalPer, url);
		this.ExInfoList.add(e);
	}
	
}
