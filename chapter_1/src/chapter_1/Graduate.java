   
	 /**     
     * @discription 学校中有学生和老师两类人，而在职研究生即使老师又是学生，对学生的管理和对教师的管理在她们身上都有体现。
     *              1）设计两个信息管理接口：StudentManageInterface和TeacherManageInterface。
     *              其中，StudentManageInterface接口包括setFee()方法和getFee()方法，分别用于设置和获取学生的学费；
     *              TeacherManageInterface接口包括setPay()方法和getPay()方法，分别用于设置和获取教师的工资。
     *              2）定义一个研究生类Graduate,实现StudentManageInterface接口和TeacherManageInterface接口
     *              它定义的成员变量有name(姓名)、sex(性别)、age(年龄)、fee(每学期学费)、pay(月工资)。
     *              3）创建一个姓名为“zhangsan”的研究生，统计他的年收入和学费，如果收入减去学费不足2000元，则输出“provide a loan”
     *              (需要贷款)信息。
     * @author 陈欢      
     * @created 2017年11月12日 下午1:45:19    
     * tags     
     * see_to_target 
     * git：    
     */
    
package chapter_1;

  
    /**        
     * Title: Graduate.java    
     * Description: 描述
     * @author 陈欢      
     * @created 2017年11月12日 下午1:45:19    
     */

public class Graduate implements StudentManageInterface,TeacherManageInterface{
	 double fee = 0,pay = 0;
	 String name,sex;
	 int age;
	 public void setFee(double f){
		fee = f;
	 }
	 public double getFee() {
		 return fee;
	 }
	 public void setPay(double p) {
		 pay = p;
	 }
	public double getPay() {
		return pay;
	 }
	 Graduate(String n,String s,int a){
		 this.name = n;
		 this.sex = s;
		 this.age = a;
		 setFee(15000);
		 setPay(2000);
		 pay = 12*getPay();//计算年薪
		 fee = 2*getFee();//计算一年的学费
	 }
	 public static void main(String[]args) {
		 Graduate zs = new Graduate("zhangsan","男",25);
		 System.out.println("姓名:"+ zs.name + "  性别:" + zs.sex + "  年龄:"+zs.age );
		 if(zs.pay-zs.fee<2000) {
			 System.out.println("provide a loan:");
			 System.out.println("需要贷款额："+(zs.fee+2000-zs.pay)+"元");
		 }
		 else {//不需要贷款则输出年薪和一年的学费
			 System.out.println("年收入:"+zs.pay);
			 System.out.println("年学费:"+zs.fee);
		 }
	 }
}
