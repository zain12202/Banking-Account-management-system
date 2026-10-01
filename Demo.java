public class Demo{
            public static void main(String args[]){
            BankAccount acc1=new BankAccount(001,"Zain",30000,"current");
	    BankAccount acc2=new BankAccount(002,"hassan",15000,"Assaan");
	    BankAccount acc3=new BankAccount(003,"Ali",20000,"Assaan");
            
            acc1.display();
            acc2.display(); 
            int afterdeposit=acc1.deposit(5000);
            System.out.println("After Deposit in Zain Account\n");
            acc1.display();
  	    System.out.println("After withdrawal in Hassan Account\n");
            int afterwithdrawl=acc2.withdrawal(2000);
            
            acc2.display();
            acc1.transfer(acc2,4000);

}
}