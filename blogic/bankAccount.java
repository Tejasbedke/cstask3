package blogic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;

import Tasks.cstask3.Exception.InsufficientBalanceExcepiton;
import Tasks.cstask3.Exception.NegativeAmountException;

public class bankAccount implements atmInterface{
      
    
    private static final String BANKNAME;
    private static final String BRANCHNAME;
    private static final String IFSC;
    
    private long ac_No=Long.parseLong(getrandomAcno());
    private String ac_HName;
    private long ac_Balance;
    
    public static String getrandomAcno() {
        StringBuilder accountNumber = new StringBuilder();

        Random random = new Random();

        // Generate 10 random digits for the account number
        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10);  // Generates a random digit between 0 and 9
            accountNumber.append(digit);
        }

        return accountNumber.toString();
    }

    static{
          String baname=null;
          String brname=null;
          String ifsc=null;
          try{
              
      BufferedReader bf= new BufferedReader(new FileReader("E:\\Codsoft Tasks\\CodsoftTasks\\src\\Tasks\\cstask3\\blogic\\bankinfo2.txt"));
       baname=bf.readLine();
       brname=bf.readLine();
       ifsc=bf.readLine();
      }catch(FileNotFoundException e){
       e.printStackTrace();
      }catch(IOException e){
       e.printStackTrace();
      }
      BANKNAME=baname;
      BRANCHNAME=brname;
      IFSC=ifsc;
   }
   
   public static String getBankname() {
       return BANKNAME;
    }
    
    
    public static String getBranchname() {
    return BRANCHNAME;
}


public static String getIfsc() {
    return IFSC;
}


public long getAc_No() {
    return ac_No;
}


public void setAc_No(long ac_No) {
    this.ac_No = ac_No;
}


public String getAc_HName() {
    return ac_HName;
}


public void setAc_HName(String ac_HName) {
    this.ac_HName = ac_HName;
}



public void setAc_Balance(long ac_Balance) {
    this.ac_Balance = ac_Balance;
}


	@Override
	public void deposit(long amt) throws NegativeAmountException {
            if(amt<0) {
            	throw new NegativeAmountException(" please insert +ve value");
            }
		  this.ac_Balance=this.ac_Balance+amt;
		  System.out.println("The "+this.ac_No+" is credited by "+amt);
		}	
	@Override
	  
    public void withdraw(long amt) throws InsufficientBalanceExcepiton,NegativeAmountException,InputMismatchException {
              
		if(amt<0) {
			throw new NegativeAmountException("please Enter positive amount ");
			
		}
		else if(amt>this.getBalnce()) {
            System.err.println("you have insufficient fund");
		}
		this.ac_Balance=this.ac_Balance-amt;
		System.out.println("The "+this.ac_No+" Debited by "+amt);
	}
    
    @Override
    public long getBalnce() {
        return this.ac_Balance;
    }

	



@Override
public String toString(){

      return 
        "Bank Account Details"+
        "\nBank Name:->"+BANKNAME+
        "\nBranch Name:->"+BRANCHNAME+
        "\nBank IFSc:->"+IFSC+
        "\nAccount Number:->"+ac_No+
        "\nAccount Holder Name:->"+ac_HName+
        "\nAccount Balance:->"+ac_Balance;
}

}
