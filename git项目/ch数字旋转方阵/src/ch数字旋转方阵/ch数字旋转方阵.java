   
	 /**     
     * @discription 在此输入一句话描述此文件的作用
     * @author 陈欢      
     * @created 2017年9月23日 下午3:11:20    
     * tags     
     * see_to_target     
     */
    
package ch数字旋转方阵;

  
    /**        
 * Title: ch数字旋转方阵.java    
 * Description: 完成一个NxN的数字旋转方阵，4<=N<=10
 * @author 陈欢      
 * @created 2017年9月23日 下午3:11:20    
 */
import java.util.Scanner; 
public class ch数字旋转方阵 {

	/**     
	 * @discription 输出6x6的数字旋转方阵，并能完成NxN的数字旋转方阵，其中N满足：4<=N<=10
	 * @author 陈欢       
	 * @created 2017年9月23日 下午3:11:20     
	 * @param args     
	 */
	static int a[][]=new int[10][10];//默认值为0  
	public static void t(int a[][],int b,int s,int d){
		//a是存储方阵元素的数组,b为每个方阵的起始位置；d是为a数组赋值的整数；s是方阵的阶数  
        int j,h=b,v=b;  
        if(s==0)
        {
        	return;          // 递归出口   
        }
        for(j=1;j<s;j++)   // 从上至下递增 
        {
        	a[h][v]=d;
        	h++;
        	d++;
        }
        for(j=1;j<s;j++)   // 从左至右递增
        {
        	a[h][v]=d;
        	v++;
        	d++;
        }
        for(j=1;j<s;j++)  // 从下至上递增   
        {
        	a[h][v]=d;
        	h--;
        	d++;
        }
        for(j=1;j<s;j++)  // 从右至左递增
        {
        	a[h][v]=d;
        	v--;
        	d++;
        }
        t(a,b+1,s-2,d); 
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int h,v,b,p,s,d,n;  
	        Scanner in=new Scanner(System.in);  
	        System.out.println("请输入n的值（4-10）:");
	        n=in.nextInt(); 
	        if(n>3 & n<11)
	        {
	            b=1;s=n;d=1;  
	            t(a,b,s,d); 
	            for(h=1;h<=n;h++)   
	            {
	            	for(v=1;v<=n;v++) 
	            	{
	            		System.out.print(a[h][v]+"\t");  
	            	}
	            		System.out.println();
	            }  
	        }
	        else
	        {
	        System.out.println("输入的n值不符合要求");
	        }
	}
}
