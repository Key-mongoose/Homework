   
	 /**     
 * @discription ���һ��ѧ����Student���������У�����(name)������(age)��ѧ��(education),
 * ��Student����������������Undergraduate���о�����Graduate�����������������ԣ�רҵ(specialty),
 * �о������������ԣ��о�����(direction)��ÿ���඼�й��췽�����������������Ϣ��show()������
 * �ڲ�����TestExtends�в��������
 * @author �»�      
 * @created 2017��10��14�� ����6:14:13    
 * tags     
 * see_to_target     
 */

/**        
 * Title: TestExtends.java    
 * Description: ������TestExtends
 * @author �»�      
 * @created 2017��10��14�� ����6:14:13    
 */

public class TestExtends {


		public static void main(String agrs[]){
		Student my = new Student("è��","Сѧ",16);
		my.show();
		System.out.println();
		Undergraduate myg = new Undergraduate("è�����","��ѧ",23,"��������ѧ");
		myg.show();
		System.out.println();
		Graduate myb = new  Graduate("è���ְ�","�о���",46,"������ʷ");
		myb.show(); 
		
		}/** 
		 * ���캯�� 
		 * @discription ������TestExtends�в������
		 * @author �»�      
		 * @created 2017��10��14�� ����6:14:13           
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
		System.out.println("������" + name + "\n" + "ѧ����" + education + "\n"+ "���䣺" + age +"\n");
	}
} 
class Undergraduate extends Student{ //��������  
    String specialty;  
    Undergraduate(String n, String e,int a,String s) {  
       super(n,e,a);  
       this.specialty = s;  
   } 
    public void show()
    {
    	System.out.println("������" + name + "\n" + "ѧ����" + education + "\n"+ "���䣺" + age + "\n" + "רҵ��" + specialty + "\n");
    }
}
class Graduate extends Student{ //�о�����  
    String direction;  
    Graduate(String n, String e,int a,String s) {  
       super(n,e,a);  
       this.direction = s;  
   } 
    public void show()
    {
    	System.out.println("������" + name + "\n" + "ѧ����" + education + "\n"+ "���䣺" + age + "\n" +" �о�����" + direction + "\n");
    }
}