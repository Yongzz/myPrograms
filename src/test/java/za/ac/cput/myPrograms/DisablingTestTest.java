package za.ac.cput.myPrograms;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
@Ignore
public class DisablingTestTest extends TestCase{


    public void testGetNumber() throws Exception {
        DisablingTest d = new DisablingTest();
        Assert.assertEquals(47,d.getNumber());

    }

}
