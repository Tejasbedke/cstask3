package blogic;

import Tasks.cstask3.Exception.InsufficientBalanceExcepiton;
import Tasks.cstask3.Exception.NegativeAmountException;
;

public interface atmInterface {
   
    public void withdraw(long amt)throws InsufficientBalanceExcepiton,NegativeAmountException;
    
    public void deposit(long amt)throws NegativeAmountException;

    public long getBalnce();

    
}
