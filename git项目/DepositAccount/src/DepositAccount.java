   
	 /**     
 * @discription ģ�����ж��ڴ���
 * @author �»�      
 * @created 2017��10��14�� ����3:38:19    
 * tags     
 * see_to_target     
 */

/**        
 * Title: DepositAccount.java    
 * Description: .ģ�����ж��ڴ��ܡ��������ж��ڴ���˻���DepositAccount�����а������˺š���������������������ʵ����ԣ�
 * �Ϳ���������ѯ��������Ϣ�ȷ�����Ҫ���þ�̬�����洢�����ʣ���˽��ʵ�������洢�������ԡ��ṩ��������Ϣ�ķ����ͼ�������Ϣ(����Ϣ/12)�ķ�����
 * �����дһ�����Գ�����Ը��࣬����Account�Ķ���saver(�˺ţ�1234567890��������ZhangSan������5000Ԫ)��������������2.3%��
 * ���2000Ԫ����ѯ�����㲢��ʾ����Ϣ��
 * @author �»�      
 * @created 2017��10��14�� ����3:38:19    
 */
import java.util.*;
public class DepositAccount {

	/** 
	 * ���캯�� 
	 * @discription �ڴ�����һ�仰��������
	 * @author �»�      
	 * @created 2017��10��14�� ����3:38:19           
	 */
	private long  number;//�˻�
	private String name; //����
	private double balance;//���
	static double  moneyrate = 0.023;//���ʣ��꣩
    DepositAccount(long num,String nam,double bal) {
		
		this.number = num;
		this.name = nam;
		this.balance = bal;
	}
    public void newnum(){//����
    	Scanner in =new Scanner(System.in);
    	System.out.println("�����봢��������");
    	String nam = in.next();
    	System.out.println("�������˺ţ�");
    	long num = in.nextInt();
    	this.number = num;
    	this.name = nam;
    	this.balance = 0;
    }
    public void deposit(){  // ���
    	Scanner in =new Scanner(System.in);
    	System.out.println("���������");
    	double n = in.nextDouble();
    	balance = balance + n;
    	System.out.println("�����������Ϊ��" + balance);
    }
    public void query(){//��ѯ
    	System.out.println("�˺ţ�" + number);
    	System.out.println("����������" + name);
    	System.out.println("��" + balance);
    	System.out.println("�����ʣ�" + moneyrate);
    }
    public void interest(){//��Ϣ����
    	double yinterest = balance * moneyrate;//����Ϣ
    	double minterest =  yinterest / 12;
    	System.out.println("����Ϣ��" + yinterest);
    	System.out.println("����Ϣ��" + minterest);
    }
}
class Account {
	 public static void main(String args[]) { 
		 DepositAccount saver = new DepositAccount(1234567890,"ZhangSan",5000.0);
		 saver.query();
		 saver.deposit();
		 saver.interest();
		 DepositAccount saver1 = new DepositAccount(000000000,"ls",0.0); 
		 saver1.newnum();
		 saver1.query();
		 saver1.deposit();
		 saver1.interest();
	 }
}

