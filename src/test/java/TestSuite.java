import org.junit.*;
import java.util.function.*;

/**
 * Defines JUnit test cases to check that sythesized code provides expected runtime behavior.
 */
public abstract class TestSuite
{

	//
	// Add here the test cases to execrise intances returned by makeTestable().
	//

        @Test(timeout=10000)
        public void Test1()
        {
             // BiFunction<Integer,Integer,Integer> adder = makeTestable();
             // int result = adder.apply(3,4);
             // Assert.assertEquals(7, result);

        }

	/**
	 * @return instances of the class to test.
	 */
	protected abstract BiFunction<Integer,Integer,Integer> makeTestable();

        // Other common useful signatures for makeTestable that can be swapped out for above:

        // protected abstract Function<Foo,Bar> makeTestable();
        // protected abstract Consumer<Foo> makeTestable();
        // protected abstract Supplier<Foo> makeTestable();
}

