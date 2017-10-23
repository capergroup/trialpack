import java.io.*;
import java.nio.file.Files;
import org.junit.*;
import java.util.*;

/**
 * Defines an interface (TestSuite.Testable) for sythesized classes to implement and also defines JUnit test cases
 * to check that sythesized code implementing the interface is correct.
 */
public abstract class TestSuite
{
	/**
	 * The interface that synthesized classes should implement.
	 */
	public interface Testable
	{
		//
		// Add methods here to be checked by the unit tests of this class.
		//

		// e.g.
		// int add(int a, int b);
	}

	//
	// Add here the test cases to execrise the methods of Testable.
	//

	// e.g.

	//	@Test
	//	public void testAdd1() throws IOException
	//	{
	//		Testable adder = makeTestable();
	//		int result = adder.add(3,4);
	//		Assert.assertEquals(7, result);
	//	}

	/**
	 * @return instances of Testable to test during unit testing.
	 */
	protected abstract Testable makeTestable();
}

