public class BankAccount{
	public int AccNo;
	public String AccName;
	private int Balance;
	public  String AccType;
        public static final String BankName="Allied Bank";
	public static int totalaccount;		
	int gettotalaccount(){
              return totalaccount;
}
    
      int deposit(int amount){
           if(amount>0) Balance+=amount;
           else System.out.println("invalid");
        
       return Balance;
} 
      int withdrawal(int amount){
      if (amount>0 && amount<=Balance) Balance-=amount;
       else System.out.println("invalid");

       return Balance;

}
        void setbalance(int balance){
             if(balance>=0) this.Balance=balance;
}
       int getbalance(){
         return Balance;
}
     void transfer(BankAccount Receiver , int amount){
     if(amount>0 && amount<=this.Balance){
        Receiver.Balance+=amount;
        System.out.println(Receiver.AccName+ " Received balance " +amount+" from " +this.AccName+ " and became "+Receiver.Balance);
        this.Balance-=amount;
        System.out.println(this.AccName+ " send balance " +amount+ " to " +Receiver.AccName+ " and became "+this.Balance);
} 
    else{
        System.out.println("Invalid transfer");
}
	
}
    
	public BankAccount(int accno,String accname,int balance,String acctype){
                  this.AccNo=accno;
                  this.AccName=accname;
		  this.AccType=acctype;
		  setbalance( balance);
                  totalaccount++;
}
     void display(){
                   System.out.println("Account number :"+AccNo);
                   System.out.println("Account name :"+AccName);
                   System.out.println("Balance is :"+getbalance());
                   System.out.println("Account Type :"+AccType);
                   System.out.println("Total accounts are :"+gettotalaccount());
}
}

                  


  
        
 		