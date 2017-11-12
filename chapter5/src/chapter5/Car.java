   
	 /**     
     * @discription ����Ҫװ��һ�����������3����Ʒ�����ӡ��������ϴ�»�����Ҫ������������С��������װ�ص�3�ֻ������������
     * 	                                          ��дһ��JavaӦ�ó���,Ҫ����һ��ComputerWeight�ӿڣ��ýӿ�����һ��������
     *              public double computeWeight();��3��ʵ�ָýӿڵ��ࣺTelevision��Computer��WashMachine��
     *              ��3����ͨ��ʵ�ֽӿ�ComputeWeight�������ء���һ��Car�࣬������ComputeWeight�ӿ����͵�������Ϊ��Ա��
     *              ��ô�������Ԫ�ؾͿ��Դ��Television��������á�Computer��������û�WashMachine��������á����������Car
     *              ������װ�Ļ������������
     * @author �»�      
     * @created 2017��11��11�� ����4:51:37    
     * tags     
     * see_to_target 
     * git��    
     */
    
package chapter5;

  
    /**        
     * Title: Car.java    
     * Description: ����
     * @author �»�      
     * @created 2017��11��11�� ����4:51:37    
     */

public class Car {
	static int []num1 = {8,10,6};//С����װ�صĵ��ӣ��������ϴ�»���Ŀ
	static int []num2 = {12,20,10};//�����װ�صĵ��ӣ��������ϴ�»���Ŀ
	public static void main(String[]args) {
		ComputeWeight[]weight = new ComputeWeight[3];
   	     weight[0] = new Television();
   	     weight[1] = new Computer();
   	     weight[2] = new WashMachine();
   	     double weightS = 0 ,weightB = 0;
   	     for(int i= 0 ;i < 3;i++)
   	     {
   	    	 weightS += num1[i] * weight[i].computeWeight();//С����װ�ص�������
   	    	 weightB += num2[i] * weight[i].computeWeight();//�����װ�ص�������
   	     }
   	     System.out.println("С������װ����"+num1[0]+"̨�������"+num1[1]+"̨��ϴ�»�"+ num1[2]+"̨��");
   	     System.out.println("�������װ����"+num2[0]+"̨�������"+num2[1]+"̨��ϴ�»�"+ num2[2]+"̨��");
   	     System.out.println("�������С����װ�ص�������Ϊ��" + (weightS+weightB)+"kg");
	}
}
