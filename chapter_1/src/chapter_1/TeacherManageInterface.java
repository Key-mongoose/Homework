   
	 /**     
     * @discription ѧУ����ѧ������ʦ�����ˣ�����ְ�о�����ʹ��ʦ����ѧ������ѧ���Ĺ���ͶԽ�ʦ�Ĺ������������϶������֡�
     *              1�����������Ϣ����ӿڣ�StudentManageInterface��TeacherManageInterface��
     *              ���У�StudentManageInterface�ӿڰ���setFee()������getFee()�������ֱ��������úͻ�ȡѧ����ѧ�ѣ�
     *              TeacherManageInterface�ӿڰ���setPay()������getPay()�������ֱ��������úͻ�ȡ��ʦ�Ĺ��ʡ�
     *              2������һ���о�����Graduate,ʵ��StudentManageInterface�ӿں�TeacherManageInterface�ӿ�
     *              ������ĳ�Ա������name(����)��sex(�Ա�)��age(����)��fee(ÿѧ��ѧ��)��pay(�¹���)��
     *              3������һ������Ϊ��zhangsan�����о�����ͳ�������������ѧ�ѣ���������ȥѧ�Ѳ���2000Ԫ���������provide a loan��
     *              (��Ҫ����)��Ϣ
     * @author �»�      
     * @created 2017��11��12�� ����1:42:45    
     * tags     
     * see_to_target 
     * git��    
     */
    
package chapter_1;

  
    /**        
     * Title: TeacherManageInterface.java    
     * Description: ����TeacherManagerInerface�ӿ�
     * @author �»�      
     * @created 2017��11��12�� ����1:42:45    
     */

interface TeacherManageInterface {
	public void setPay(double pay);
	public double getPay();
}
