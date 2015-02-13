package za.ac.cput.myPrograms;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class FalseTest {
    @Test
    public void testGetYESNO() throws Exception {
        False f = new False();

        Assert.assertFalse(f.GetYESNO());

    }
}
