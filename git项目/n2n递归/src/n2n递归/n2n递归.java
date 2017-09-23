
	 /**     
     * @discription 在此输入一句话描述此文件的作用
     * @author 陈欢      
     * @created 2017年9月23日 下午2:19:34    
     * tags     
     * see_to_target     
     */
    
package n2n递归;
import java.util.*;
  
    /**        
 * Title: n2n递归.java    
 * Description: 不用循环和本地变量，按照顺序输出值
 * @author 陈欢      
 * @created 2017年9月23日 下午2:19:34    
 */

public class n2n递归 {

	/**     
	 * @discription 一个整数，大于0，不用循环和本地变量，按照n，2n，4n，8n的顺序 递增，当值大于5000时，把值按照指定顺序输出来。
	 *              例：n=1237
	 *              输出为：
	 *              1237
	 *              2474
	 *              4948
	 *              9896
	 *              9896
	 *              4948
	 *              2427
	 *              1237  
	 * @author 陈欢       
	 * @created 2017年9月23日 下午2:19:34     
	 * @param args     
	 */
	public static void Num(int a){
			if (a <= 0)
			{
			    System.out.println("输入的数不大于0！！！");
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
		System.out.println("请输入整数 n(0-5000)：");
		int n = in.nextInt();
		if(n > 5000)
		{
			System.out.println("输入的n不符合条件！！");
		}
		else 
		{
			Num(n);
		}
	}
}
