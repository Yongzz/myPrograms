package za.ac.cput.myPrograms;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class NullnessTest extends TestCase {


    public void testGetN() throws Exception {
        Nullness n = new Nullness();

        Assert.assertNull(n.getN());

    }
}
