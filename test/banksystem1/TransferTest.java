
package banksystem1;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static junit.framework.TestCase.assertEquals;

public class TransferTest{
    Account acc1 , acc2 , acc3;
    
    public TransferTest() {
    }
    @Before
    public void setUp () throws Exception
    {
      acc1=new Account("hosam" , "00" , 1000.0 , "TestTransfer1");  
      acc2=new Account("mohannad" , "000" , 1000.0 , "TestTransfer2");  
      acc3=new Account("Ahmed" , "0" , 0.0 , "TestTransfer3");
    }

    @Test
    public void TestTransfer() throws Exception {
        acc1.transfer(acc2 , 100.0);
        acc2.transfer(acc1, 922);
        assertEquals(1822.0,acc1.getBalance());
        assertEquals(178.0,acc2.getBalance());
        
        acc1.transfer(acc2,1000000.0);
        assertEquals(1822.0,acc1.getBalance());
        assertEquals(178.0,acc2.getBalance());
        
        acc2.transfer(acc1, 100000000);
        assertEquals(1822.0,acc1.getBalance());
        assertEquals(178.0,acc2.getBalance());
        
        acc1.transfer(acc2, -666);
        assertEquals(1822.0,acc1.getBalance());
        assertEquals(178.0,acc2.getBalance());
        
        acc2.transfer(acc1,-9999);
        assertEquals(1822.0,acc1.getBalance());
        assertEquals(178.0,acc2.getBalance());
        
        acc1.transfer(acc3 , acc1.getBalance());
        assertEquals(1822.0,acc3.getBalance());
        acc2.transfer(acc3 , acc2.getBalance());
        assertEquals(2000.0,acc3.getBalance());
        
    }
    
}
