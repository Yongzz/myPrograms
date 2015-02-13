package za.ac.cput.myPrograms;

/**
 * Created by student on 2015/02/12.
 */
public class Exception11Timeouts {
    public int devide(int a, int b)
    {
        if(b == 0)
        {
            throw new ArithmeticException();
        }
        return a/b;
    }
}
