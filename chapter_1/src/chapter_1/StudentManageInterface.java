   
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
     * @created 2017��11��12�� ����1:40:44    
     * tags     
     * see_to_target 
     * git��    
     */
    
package chapter_1;

  
    /**        
     * Title: StudentManageInterface.java    
     * Description: ����ӿ�StudentManageInterface
     * @author �»�      
     * @created 2017��11��12�� ����1:40:44    
     */

interface StudentManageInterface {
	 public void setFee(double fee);
	 public double getFee();	
}
