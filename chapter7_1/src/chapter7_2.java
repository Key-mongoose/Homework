   
	 /**     
     * @discription �ȱ�дһ��������������ʽΪ��yyyy/mm/dd����ʽ�������ַ���ת��Ϊ���ڶ���
     * �����ڹ淶���������Ϲ涨�����׳��쳣������main�����ж��������쳣����������ַ����ֱ�
     * ������֤�������ת��������ڶ���
     * @author �»�      
     * @created 2017��11��20�� ����5:30:22    
     * tags     
     * see_to_target 
     * git��    
     */
import java.util.*; 

    /**        
     * Title: chapter7_2.java    
     * Description: ����
     * @author �»�      
     * @created 2017��11��20�� ����5:30:22    
     */

public class chapter7_2 {
	public static void main(String[] args) {
		int yy,mm,dd,x=0,y;
		change ymd= new change();
		yy = ymd.gety();
		mm = ymd.getm();
		dd = ymd.getd();
		try {
			y=yy/mm/dd;//�����ղ���Ϊ��
			if(mm<12 && dd<31) {
				x = y;
			}
			System.out.println(yy+"��"+ mm +"��" + dd +"��");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("��/��/�ղ���Ϊ0");
		}
		finally{
			y=0;
		}
	
	}
}
	
