
import java.util.*;
/**
<<<<<<< HEAD
 * Lists Ŭ������ ������� ��������� �з��Ͽ� �����ϱ� ���� �ʿ��� Ŭ�����̴�.
=======
 * Lists Ŭ������ ������� � �������� �з��Ͽ� �����ϱ� ���� �ʿ��� Ŭ�����̴�.
>>>>>>> 7af0be90c448cfb2c0bc3ec22899b80e36ac8335
 * 
 * @author HUH CHANG-HYUN
 */
public class Lists {

	public final ArrayList<Part> Part_List = new ArrayList<Part>();

	public Lists() {
		Part p1 = new Part("����");
		p1.AddExerciseInfo("�з��� Ǫ����", 20, 120, 18,
				"https://www.youtube.com/watch?v=-_DUjHxgmWk&list=PLzHSf8hnzg85NC8bY1_64OBCTncMmmFUB");
		p1.AddExerciseInfo("���� Ǫ����", 15, 90, 18, "https://www.youtube.com/watch?v=vhFqzT_D3kc");
		p1.AddExerciseInfo("���̾Ƹ�� Ǫ����", 15, 90, 18, "https://www.youtube.com/watch?v=GZrKaAvShbA");
		p1.AddExerciseInfo("���� Ǫ����", 15, 90, 10, "https://www.youtube.com/watch?v=TSGR0rqhxo0");
		p1.AddExerciseInfo("���� ����", 15, 90, 15, "https://www.youtube.com/watch?v=8KuqUSAgYqY");
		Part_List.add(p1);

		Part p2 = new Part("��");
		p2.AddExerciseInfo("���� ������ �ο�", 20, 120, 25, "https://www.youtube.com/watch?v=XZV9IwluPjw");
		p2.AddExerciseInfo("���۸� �ο�", 15, 90, 18, "https://www.youtube.com/watch?v=jv-ccooNVLk");
		p2.AddExerciseInfo("������ ���ö���", 15, 90, 18, "https://www.youtube.com/watch?v=9q_uz605P_k");
		p2.AddExerciseInfo("�� �ͽ��ټ�", 10, 60, 10, "https://www.youtube.com/watch?v=0gRQTOiL1HQ");
		Part_List.add(p2);

		Part p3 = new Part("�ھ�");
		p3.AddExerciseInfo("�÷�ũ", 1, 30, 27, "https://www.youtube.com/watch?v=QkCHldUiFt4");
		p3.AddExerciseInfo("���̵� �÷�ũ", 1, 10, 20, "https://www.youtube.com/watch?v=MD3vCPQi7WU"); // 20
		p3.AddExerciseInfo("������ �÷�ũ", 1, 20, 20, "https://www.youtube.com/watch?v=xVTmi3peEvU");
		p3.AddExerciseInfo("Ʈ����Ʈ �÷�ũ", 15, 90, 18, "https://www.youtube.com/watch?v=f1L6ch1y5YA");
		Part_List.add(p3);

		Part p4 = new Part("����");
		p4.AddExerciseInfo("�˾�", 30, 90, 27, "https://www.youtube.com/watch?v=80N4tDCyzKc");
		p4.AddExerciseInfo("ũ��ġ", 20, 90, 12, "https://www.youtube.com/watch?v=NpsdFbhAR0Q");
		p4.AddExerciseInfo("���׷�����", 20, 90, 12, "https://www.youtube.com/watch?v=TbjbJKqz6vI");
		p4.AddExerciseInfo("����ġ", 20, 90, 18, "https://www.youtube.com/watch?v=fP55EzRZM2g");
		p4.AddExerciseInfo("���̽�Ŭ ũ��ġ", 15, 60, 10, "https://www.youtube.com/watch?v=B_B5C8gSP0U");
		Part_List.add(p4);

		Part p5 = new Part("��ü");
<<<<<<< HEAD
		p5.AddExerciseInfo("����Ʈ", 30, 120, 27, "https://www.youtube.com/watch?v=f8GRxHJhn_M");
=======
		p5.AddExerciseInfo("����Ʈ", 30, 5, 27, "https://www.youtube.com/watch?v=f8GRxHJhn_M");
>>>>>>> 7af0be90c448cfb2c0bc3ec22899b80e36ac8335
		p5.AddExerciseInfo("���̵� ����Ʈ", 30, 120, 27, "https://www.youtube.com/watch?v=Gp4Cho7z5HU");
		p5.AddExerciseInfo("����", 20, 90, 18, "https://www.youtube.com/watch?v=oYiBDWhmrX8");
		p5.AddExerciseInfo("ī��������", 30, 90, 18, "https://www.youtube.com/watch?v=UBEYmHEC9PE");
		p5.AddExerciseInfo("���̵� ���׷�����", 20, 90, 18, "https://www.youtube.com/watch?v=HXMb5LTtBNo");
		Part_List.add(p5);
	}

}