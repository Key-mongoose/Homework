   
	 /**     
     * @discription 先编写一个方法，它将格式为“yyyy/mm/dd”形式的日期字符串转化为日期对象。
     * 若日期规范不符合以上规定，则抛出异常。再在main方法中对正常和异常输入的日期字符串分别
     * 进行验证。并输出转换后的日期对象。
     * @author 陈欢      
     * @created 2017年11月20日 下午5:30:22    
     * tags     
     * see_to_target 
     * git：    
     */
import java.util.*; 

    /**        
     * Title: chapter7_2.java    
     * Description: 描述
     * @author 陈欢      
     * @created 2017年11月20日 下午5:30:22    
     */

public class chapter7_2 {
	public static void main(String[] args) {
		int yy,mm,dd,x=0,y;
		change ymd= new change();
		yy = ymd.gety();
		mm = ymd.getm();
		dd = ymd.getd();
		try {
			y=yy/mm/dd;//年月日不能为零
			if(mm<12 && dd<31) {
				x = y;
			}
			System.out.println(yy+"年"+ mm +"月" + dd +"日");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("年/月/日不能为0");
		}
		finally{
			y=0;
		}
	
	}
}
	
