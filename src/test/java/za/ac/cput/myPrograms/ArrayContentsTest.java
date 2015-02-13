package za.ac.cput.myPrograms;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class ArrayContentsTest {
    @Test
    public void testName() throws Exception {
        int[] thisList = {1,2,3};
        ArrayContents a = new ArrayContents();
        Assert.assertArrayEquals(a.getList(),thisList);
    }
}
