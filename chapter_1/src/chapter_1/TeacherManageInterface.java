   
	 /**     
     * @discription 学校中有学生和老师两类人，而在职研究生即使老师又是学生，对学生的管理和对教师的管理在她们身上都有体现。
     *              1）设计两个信息管理接口：StudentManageInterface和TeacherManageInterface。
     *              其中，StudentManageInterface接口包括setFee()方法和getFee()方法，分别用于设置和获取学生的学费；
     *              TeacherManageInterface接口包括setPay()方法和getPay()方法，分别用于设置和获取教师的工资。
     *              2）定义一个研究生类Graduate,实现StudentManageInterface接口和TeacherManageInterface接口
     *              它定义的成员变量有name(姓名)、sex(性别)、age(年龄)、fee(每学期学费)、pay(月工资)。
     *              3）创建一个姓名为“zhangsan”的研究生，统计他的年收入和学费，如果收入减去学费不足2000元，则输出“provide a loan”
     *              (需要贷款)信息
     * @author 陈欢      
     * @created 2017年11月12日 下午1:42:45    
     * tags     
     * see_to_target 
     * git：    
     */
    
package chapter_1;

  
    /**        
     * Title: TeacherManageInterface.java    
     * Description: 定义TeacherManagerInerface接口
     * @author 陈欢      
     * @created 2017年11月12日 下午1:42:45    
     */

interface TeacherManageInterface {
	public void setPay(double pay);
	public double getPay();
}
