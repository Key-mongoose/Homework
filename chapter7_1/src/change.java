import java.util.Scanner;

/**     
     * @discription �ڴ�����һ�仰�������ļ�������
     * @author �»�      
     * @created 2017��11��20�� ����6:44:59    
     * tags     
     * see_to_target 
     * git��    
     */

/**        
 * Title: change.java    
 * Description: ����
 * @author �»�      
 * @created 2017��11��20�� ����6:44:59    
 */
import java.util.*; 
public class change {
	String date;
	 int yy,mm,dd,x=0,y=0;
	 String result;
	 change() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("�밴�ա�yyyy/mm/dd����ʽ����һ������:");
	 date = sc.nextLine()+" ";
	 result = date.replaceAll("\\d","a");
	 if(result.equals("aaaa/aa/aa "))
	    {
	    	 String y = date.substring(0,4);
	    	 String m = date.substring(5,7);
	    	 String d = date.substring(8,10);
	    	 yy = Integer.parseInt(y);
	    	 mm = Integer.parseInt(m);
	    	 dd = Integer.parseInt(d);
	    }
	 else {
	       
		         System.out.println("��ʽ����ȷ��");
	      
	     }
 }
	 public int  gety(){
		 return yy;
	 }
	 public int  getm(){
		 return mm;
	 }
	 public int  getd(){
		 return dd;
	 }
}
