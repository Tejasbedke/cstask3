package Exception;

public class InsufficientBalanceExcepiton extends Exception{

        
	public InsufficientBalanceExcepiton(){
		super();
	}
	public InsufficientBalanceExcepiton(String errmsg){
		super(errmsg);
	}
	
	public InsufficientBalanceExcepiton(Exception e){
		super(e);
	}

}
