import java.util.Scanner;

/**     
     * @discription 在此输入一句话描述此文件的作用
     * @author 陈欢      
     * @created 2017年11月20日 下午6:44:59    
     * tags     
     * see_to_target 
     * git：    
     */

/**        
 * Title: change.java    
 * Description: 描述
 * @author 陈欢      
 * @created 2017年11月20日 下午6:44:59    
 */
import java.util.*; 
public class change {
	String date;
	 int yy,mm,dd,x=0,y=0;
	 String result;
	 change() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("请按照“yyyy/mm/dd”格式输入一个日期:");
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
	       
		         System.out.println("格式不正确！");
	      
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
