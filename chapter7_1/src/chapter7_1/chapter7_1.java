   
	 /**     
     * @discription �ȴӼ���������һ��16���������ٽ���ת��Ϊʮ��������Ȼ�������������Ĳ���һ����Ч��ʮ�����ƣ����׳��쳣��
     * @author �»�      
     * @created 2017��11��14�� ����6:00:23    
     * tags     
     * see_to_target 
     * git��    
     */
    
package chapter7_1;

import  java.util.*;
/**        
     * Title: chapter7_1.java    
     * Description: ����
     * @author �»�      
     * @created 2017��11��14�� ����6:00:23    
     */

public class chapter7_1 {
	String N10,N16;
	public static void main(String[] args) {
		int N10;
		String N16;
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��16��������");
		N16 = sc.nextLine();
		try {
			N10 = Integer.parseInt(N16,16);
		    }
		catch(Exception e){
			e.printStackTrace();
			System.out.println("��������");
			N10 = 0;
		     }	
		finally{
			System.out.println("�Ѿ�����");
		}
		System.out.println("ת��Ϊ10����Ϊ��"+N10);
    }
}
