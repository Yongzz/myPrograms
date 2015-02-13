package za.ac.cput.myPrograms;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class OEqualtyTest extends TestCase {
    @Test
    public void testGetNames() throws Exception {
        OEquality n1 = new OEquality("Yongama");
        OEquality n2 = new OEquality("Yongama");

        Assert.assertEquals(n1.getNames(),n2.getNames());
    }
}
