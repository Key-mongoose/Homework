   
	 /**     
     * @discription �ڴ�����һ�仰�������ļ�������
     * @author �»�      
     * @created 2017��9��23�� ����3:11:20    
     * tags     
     * see_to_target     
     */
    
package ch������ת����;

  
    /**        
 * Title: ch������ת����.java    
 * Description: ���һ��NxN��������ת����4<=N<=10
 * @author �»�      
 * @created 2017��9��23�� ����3:11:20    
 */
import java.util.Scanner; 
public class ch������ת���� {

	/**     
	 * @discription ���6x6��������ת���󣬲������NxN��������ת��������N���㣺4<=N<=10
	 * @author �»�       
	 * @created 2017��9��23�� ����3:11:20     
	 * @param args     
	 */
	static int a[][]=new int[10][10];//Ĭ��ֵΪ0  
	public static void t(int a[][],int b,int s,int d){
		//a�Ǵ洢����Ԫ�ص�����,bΪÿ���������ʼλ�ã�d��Ϊa���鸳ֵ��������s�Ƿ���Ľ���  
        int j,h=b,v=b;  
        if(s==0)
        {
        	return;          // �ݹ����   
        }
        for(j=1;j<s;j++)   // �������µ��� 
        {
        	a[h][v]=d;
        	h++;
        	d++;
        }
        for(j=1;j<s;j++)   // �������ҵ���
        {
        	a[h][v]=d;
        	v++;
        	d++;
        }
        for(j=1;j<s;j++)  // �������ϵ���   
        {
        	a[h][v]=d;
        	h--;
        	d++;
        }
        for(j=1;j<s;j++)  // �����������
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
	        System.out.println("������n��ֵ��4-10��:");
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
	        System.out.println("�����nֵ������Ҫ��");
	        }
	}
}
