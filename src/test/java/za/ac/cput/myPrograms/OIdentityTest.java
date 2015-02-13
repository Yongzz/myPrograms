package za.ac.cput.myPrograms;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class OIdentityTest extends TestCase{
    @Test
    public void testGetID() throws Exception {
        OIdentity o = new OIdentity(2142);
        OIdentity o1 = new OIdentity(2122);

        Assert.assertEquals(o,o);

    }
}
