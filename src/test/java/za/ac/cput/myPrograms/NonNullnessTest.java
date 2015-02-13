package za.ac.cput.myPrograms;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class NonNullnessTest extends TestCase{

    public void testNotNull() throws Exception {
        NonNullness n = new NonNullness();
        Assert.assertNotNull(n.notNull());
    }
}
