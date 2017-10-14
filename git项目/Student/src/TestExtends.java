   
	 /**     
 * @discription 设计一个学生类Student，其属性有：姓名(name)、年龄(age)、学历(education),
 * 由Student类派生出本科生类Undergraduate和研究生类Graduate，本科生类增加属性：专业(specialty),
 * 研究生类增加属性：研究方向(direction)。每个类都有构造方法和用于输出属性信息的show()方法，
 * 在测试类TestExtends中测试输出。
 * @author 陈欢      
 * @created 2017年10月14日 下午6:14:13    
 * tags     
 * see_to_target     
 */

/**        
 * Title: TestExtends.java    
 * Description: 测试类TestExtends
 * @author 陈欢      
 * @created 2017年10月14日 下午6:14:13    
 */

public class TestExtends {


		public static void main(String agrs[]){
		Student my = new Student("猫鼬","小学",16);
		my.show();
		System.out.println();
		Undergraduate myg = new Undergraduate("猫鼬哥哥","大学",23,"汉语言文学");
		myg.show();
		System.out.println();
		Graduate myb = new  Graduate("猫鼬爸爸","研究生",46,"汉唐历史");
		myb.show(); 
		
		}/** 
		 * 构造函数 
		 * @discription 测试类TestExtends中测试输出
		 * @author 陈欢      
		 * @created 2017年10月14日 下午6:14:13           
		 */
			// TODO Auto-generated constructor stub
}
class Student{
	String name,education;
	int age;
	Student(String n,String e, int a){
		this.name = n;
		this.education = e;
	    this.age = a;
	}
	public void show(){
		System.out.println("姓名：" + name + "\n" + "学历：" + education + "\n"+ "年龄：" + age +"\n");
	}
} 
class Undergraduate extends Student{ //本科生类  
    String specialty;  
    Undergraduate(String n, String e,int a,String s) {  
       super(n,e,a);  
       this.specialty = s;  
   } 
    public void show()
    {
    	System.out.println("姓名：" + name + "\n" + "学历：" + education + "\n"+ "年龄：" + age + "\n" + "专业：" + specialty + "\n");
    }
}
class Graduate extends Student{ //研究生类  
    String direction;  
    Graduate(String n, String e,int a,String s) {  
       super(n,e,a);  
       this.direction = s;  
   } 
    public void show()
    {
    	System.out.println("姓名：" + name + "\n" + "学历：" + education + "\n"+ "年龄：" + age + "\n" +" 研究方向：" + direction + "\n");
    }
}