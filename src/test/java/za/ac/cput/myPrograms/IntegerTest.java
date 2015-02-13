package za.ac.cput.myPrograms;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/10.
 */
public class IntegerTest extends TestCase{
    @Test
    public void testGetNumber() throws Exception {
        Integer i = new Integer();
        assertEquals(22,i.getNumber());

    }
}
