
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Timer;
import java.util.TimerTask;
/**
<<<<<<< HEAD
 * Module_Methods Ŭ������ ���� ��û �� ��ž��ġ ������ ���� �ʿ��� Ŭ�����̴�.
 *
 * '�ȳ� ���� ��û'����� ShowVideo() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * '��ž��ġ'����� TimeWatch() �޼ҵ带 ����Ͽ� �����Ѵ�.
=======
 * Module_Methods Ŭ������ �� ���� �޼ҵ带 ������ �ִ�.
 * 
 * '�ȳ� ���� ��û'�� ShowVideo() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * '� ���� �� Ÿ�̸� ���'�� TimeWatch() �޼ҵ带 ����Ͽ� �����Ѵ�.
>>>>>>> 7af0be90c448cfb2c0bc3ec22899b80e36ac8335
 * 
 * @author LEE JAE-HYUB
 */
public class Module_Methods {
	
	public static int count;	// for Calculating remaining time
	
	public static void TimeWatch(int limit) {
		// Using TimeWatch for "limit" seconds
		count = 0;
		Timer m_timer = new Timer();
		TimerTask m_task = new TimerTask() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				if(count < (limit/10)-1) {
					System.out.println( (limit - count*10) + " �� ���ҽ��ϴ�.");
					toolkit.beep();
					count++;
				}
				else if(count == (limit/10)-1) {
					System.out.println("10 �� ���ҽ��ϴ�. ��������!");
					toolkit.beep();
					count++;
				}
				else {
					toolkit.beep();
					System.out.println("�����ϼ̽��ϴ�.");
					System.out.println("--------------------");
					System.out.println("1. ��ϱ�");
					System.out.println("2. Ķ���� Ȯ�� �� �����ϱ�");
					System.out.println("3. �����ϱ�");
					m_timer.cancel();
					
				}
			}
		};
		m_timer.schedule(m_task,0,10000);
	}
	
	public static void ShowVideo(String url) {
	      try
	      {
	         Desktop.getDesktop().browse(new URI(url)); 
	      }
	      catch (IOException e)
	      {
	         e.printStackTrace(); 
	      } 
	      catch (URISyntaxException e)
	      {
	         e.printStackTrace(); 
	      }
	}
	
}
