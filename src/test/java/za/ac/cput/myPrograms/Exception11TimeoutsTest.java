package za.ac.cput.myPrograms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

/**
 * Created by student on 2015/02/13.
 */

public class Exception11TimeoutsTest {

    @Test//(Expected =ArithmeticException.class, timeout = 0)
    public void testGetNumber() throws Exception {
        Exception11Timeouts e = new Exception11Timeouts();
        Assert.assertEquals(7,e.devide(12,7));
    }
}
