   
	 /**     
     * @discription ѧУ����ѧ������ʦ�����ˣ�����ְ�о�����ʹ��ʦ����ѧ������ѧ���Ĺ���ͶԽ�ʦ�Ĺ������������϶������֡�
     *              1�����������Ϣ����ӿڣ�StudentManageInterface��TeacherManageInterface��
     *              ���У�StudentManageInterface�ӿڰ���setFee()������getFee()�������ֱ��������úͻ�ȡѧ����ѧ�ѣ�
     *              TeacherManageInterface�ӿڰ���setPay()������getPay()�������ֱ��������úͻ�ȡ��ʦ�Ĺ��ʡ�
     *              2������һ���о�����Graduate,ʵ��StudentManageInterface�ӿں�TeacherManageInterface�ӿ�
     *              ������ĳ�Ա������name(����)��sex(�Ա�)��age(����)��fee(ÿѧ��ѧ��)��pay(�¹���)��
     *              3������һ������Ϊ��zhangsan�����о�����ͳ�������������ѧ�ѣ���������ȥѧ�Ѳ���2000Ԫ���������provide a loan��
     *              (��Ҫ����)��Ϣ��
     * @author �»�      
     * @created 2017��11��12�� ����1:45:19    
     * tags     
     * see_to_target 
     * git��    
     */
    
package chapter_1;

  
    /**        
     * Title: Graduate.java    
     * Description: ����
     * @author �»�      
     * @created 2017��11��12�� ����1:45:19    
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
		 pay = 12*getPay();//������н
		 fee = 2*getFee();//����һ���ѧ��
	 }
	 public static void main(String[]args) {
		 Graduate zs = new Graduate("zhangsan","��",25);
		 System.out.println("����:"+ zs.name + "  �Ա�:" + zs.sex + "  ����:"+zs.age );
		 if(zs.pay-zs.fee<2000) {
			 System.out.println("provide a loan:");
			 System.out.println("��Ҫ����"+(zs.fee+2000-zs.pay)+"Ԫ");
		 }
		 else {//����Ҫ�����������н��һ���ѧ��
			 System.out.println("������:"+zs.pay);
			 System.out.println("��ѧ��:"+zs.fee);
		 }
	 }
}
