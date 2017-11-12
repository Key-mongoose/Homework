   
	 /**     
     * @discription 卡车要装载一批货物，货物有3种商品：电视、计算机和洗衣机。需要计算出大货车和小货车各自装载的3种货物的总重量。
     * 	                                          编写一个Java应用程序,要求有一个ComputerWeight接口，该接口中有一个方法：
     *              public double computeWeight();有3个实现该接口的类：Television、Computer和WashMachine。
     *              这3个类通过实现接口ComputeWeight给出自重。有一个Car类，该类用ComputeWeight接口类型的数组作为成员，
     *              那么该数组的元素就可以存放Television对象的引用、Computer对象的引用或WashMachine对象的引用。程序能输出Car
     *              对象所装的货物的总重量。
     * @author 陈欢      
     * @created 2017年11月11日 下午4:40:55    
     * tags     
     * see_to_target 
     * git：    
     */
    
package chapter5;

  
    /**        
     * Title: Television.java    
     * Description: 给出电视的自重
     * @author 陈欢      
     * @created 2017年11月11日 下午4:40:55    
     */

public class Television implements ComputeWeight{
		public double computeWeight() {
			return 10;
		}
}
