   
	 /**     
 * @discription 模拟银行定期存款功能
 * @author 陈欢      
 * @created 2017年10月14日 下午3:38:19    
 * tags     
 * see_to_target     
 */

/**        
 * Title: DepositAccount.java    
 * Description: .模拟银行定期存款功能。创建银行定期存款账户类DepositAccount，其中包括：账号、储户姓名、存款余额、年利率等属性，
 * 和开户、存款、查询、计算利息等方法。要求用静态变量存储年利率，用私有实例变量存储其它属性。提供计算年利息的方法和计算月利息(年利息/12)的方法。
 * 另外编写一个测试程序测试该类，建立Account的对象saver(账号：1234567890，姓名：ZhangSan，定存5000元)，设置年利率是2.3%，
 * 存款2000元，查询余额，计算并显示年利息。
 * @author 陈欢      
 * @created 2017年10月14日 下午3:38:19    
 */
import java.util.*;
public class DepositAccount {

	/** 
	 * 构造函数 
	 * @discription 在此输入一句话描述作用
	 * @author 陈欢      
	 * @created 2017年10月14日 下午3:38:19           
	 */
	private long  number;//账户
	private String name; //姓名
	private double balance;//余额
	static double  moneyrate = 0.023;//利率（年）
    DepositAccount(long num,String nam,double bal) {
		
		this.number = num;
		this.name = nam;
		this.balance = bal;
	}
    public void newnum(){//开户
    	Scanner in =new Scanner(System.in);
    	System.out.println("请输入储户姓名：");
    	String nam = in.next();
    	System.out.println("请输入账号：");
    	long num = in.nextInt();
    	this.number = num;
    	this.name = nam;
    	this.balance = 0;
    }
    public void deposit(){  // 存款
    	Scanner in =new Scanner(System.in);
    	System.out.println("请输入存款金额：");
    	double n = in.nextDouble();
    	balance = balance + n;
    	System.out.println("现在您的余额为：" + balance);
    }
    public void query(){//查询
    	System.out.println("账号：" + number);
    	System.out.println("储户姓名：" + name);
    	System.out.println("余额：" + balance);
    	System.out.println("年利率：" + moneyrate);
    }
    public void interest(){//利息计算
    	double yinterest = balance * moneyrate;//年利息
    	double minterest =  yinterest / 12;
    	System.out.println("年利息：" + yinterest);
    	System.out.println("月利息：" + minterest);
    }
}
class Account {
	 public static void main(String args[]) { 
		 DepositAccount saver = new DepositAccount(1234567890,"ZhangSan",5000.0);
		 saver.query();
		 saver.deposit();
		 saver.interest();
		 DepositAccount saver1 = new DepositAccount(000000000,"ls",0.0); 
		 saver1.newnum();
		 saver1.query();
		 saver1.deposit();
		 saver1.interest();
	 }
}

