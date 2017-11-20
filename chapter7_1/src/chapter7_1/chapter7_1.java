   
	 /**     
     * @discription 先从键盘上收入一个16进制数，再将其转化为十进制数，然后输出。若输入的不是一个有效的十六进制，则抛出异常。
     * @author 陈欢      
     * @created 2017年11月14日 下午6:00:23    
     * tags     
     * see_to_target 
     * git：    
     */
    
package chapter7_1;

import  java.util.*;
/**        
     * Title: chapter7_1.java    
     * Description: 描述
     * @author 陈欢      
     * @created 2017年11月14日 下午6:00:23    
     */

public class chapter7_1 {
	String N10,N16;
	public static void main(String[] args) {
		int N10;
		String N16;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个16进制数：");
		N16 = sc.nextLine();
		try {
			N10 = Integer.parseInt(N16,16);
		    }
		catch(Exception e){
			e.printStackTrace();
			System.out.println("输入有误！");
			N10 = 0;
		     }	
		finally{
			System.out.println("已经处理。");
		}
		System.out.println("转化为10进制为："+N10);
    }
}
