
	 /**     
     * @discription �ڴ�����һ�仰�������ļ�������
     * @author �»�      
     * @created 2017��9��23�� ����2:19:34    
     * tags     
     * see_to_target     
     */
    
package n2n�ݹ�;
import java.util.*;
  
    /**        
 * Title: n2n�ݹ�.java    
 * Description: ����ѭ���ͱ��ر���������˳�����ֵ
 * @author �»�      
 * @created 2017��9��23�� ����2:19:34    
 */

public class n2n�ݹ� {

	/**     
	 * @discription һ������������0������ѭ���ͱ��ر���������n��2n��4n��8n��˳�� ��������ֵ����5000ʱ����ֵ����ָ��˳���������
	 *              ����n=1237
	 *              ���Ϊ��
	 *              1237
	 *              2474
	 *              4948
	 *              9896
	 *              9896
	 *              4948
	 *              2427
	 *              1237  
	 * @author �»�       
	 * @created 2017��9��23�� ����2:19:34     
	 * @param args     
	 */
	public static void Num(int a){
			if (a <= 0)
			{
			    System.out.println("�������������0������");
			}
			if(a/2<5000 & a >0)
			{
				System.out.println(a);
				Num(2*a);
				System.out.println(a);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("���������� n(0-5000)��");
		int n = in.nextInt();
		if(n > 5000)
		{
			System.out.println("�����n��������������");
		}
		else 
		{
			Num(n);
		}
	}
}
