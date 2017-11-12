   
	 /**     
     * @discription 卡车要装载一批货物，货物有3种商品：电视、计算机和洗衣机。需要计算出大货车和小货车各自装载的3种货物的总重量。
     * 	                                          编写一个Java应用程序,要求有一个ComputerWeight接口，该接口中有一个方法：
     *              public double computeWeight();有3个实现该接口的类：Television、Computer和WashMachine。
     *              这3个类通过实现接口ComputeWeight给出自重。有一个Car类，该类用ComputeWeight接口类型的数组作为成员，
     *              那么该数组的元素就可以存放Television对象的引用、Computer对象的引用或WashMachine对象的引用。程序能输出Car
     *              对象所装的货物的总重量。
     * @author 陈欢      
     * @created 2017年11月11日 下午4:51:37    
     * tags     
     * see_to_target 
     * git：    
     */
    
package chapter5;

  
    /**        
     * Title: Car.java    
     * Description: 描述
     * @author 陈欢      
     * @created 2017年11月11日 下午4:51:37    
     */

public class Car {
	static int []num1 = {8,10,6};//小货车装载的电视，计算机，洗衣机数目
	static int []num2 = {12,20,10};//大货车装载的电视，计算机，洗衣机数目
	public static void main(String[]args) {
		ComputeWeight[]weight = new ComputeWeight[3];
   	     weight[0] = new Television();
   	     weight[1] = new Computer();
   	     weight[2] = new WashMachine();
   	     double weightS = 0 ,weightB = 0;
   	     for(int i= 0 ;i < 3;i++)
   	     {
   	    	 weightS += num1[i] * weight[i].computeWeight();//小货车装载的总重量
   	    	 weightB += num2[i] * weight[i].computeWeight();//大货车装载的总重量
   	     }
   	     System.out.println("小货车可装电视"+num1[0]+"台，计算机"+num1[1]+"台，洗衣机"+ num1[2]+"台。");
   	     System.out.println("大货车可装电视"+num2[0]+"台，计算机"+num2[1]+"台，洗衣机"+ num2[2]+"台。");
   	     System.out.println("大货车和小货车装载的总重量为：" + (weightS+weightB)+"kg");
	}
}
