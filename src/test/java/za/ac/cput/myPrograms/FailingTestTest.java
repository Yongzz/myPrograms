package za.ac.cput.myPrograms;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class FailingTestTest extends TestCase{
    @Test
    public void testGetNumber() throws Exception {
        FailingTest f = new FailingTest();
        Assert.assertEquals(1,f.getNumber());
       fail();

    }
}
