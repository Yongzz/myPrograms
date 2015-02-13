package za.ac.cput.myPrograms;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/10.
 */
public class FloatingPointTest extends TestCase {
    @Test
    public void testGetPrice() throws Exception {
        FloatingPoint f = new FloatingPoint();
        assertEquals(12.3f, f.getPrice());
    }
}
