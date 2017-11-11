import java.util.function.*;

/**
 * Create here a class eligable to be returned from TestSuite::makeTestable()
 */
public class PassProgram implements BiFunction<Integer,Integer,Integer>
{
    public Integer apply(Integer a, Integer b)
    {
         return -1;
    }
}


