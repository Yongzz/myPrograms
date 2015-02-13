package za.ac.cput.myPrograms;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class TruthTest extends TestCase{
    @Test
    public void testGetYESNO() throws Exception {
        Truth t = new Truth();

        Assert.assertTrue(t.getYESNO());

    }
}
