package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * JUnit4 test suite for {@link ReturnsDeepStubs}.
 *
 * Note: Since {@link ReturnsDeepStubs} is itself part of the Mockito framework and is designed
 * to be used as an {@link org.mockito.stubbing.Answer} passed into {@code Mockito.mock(...)},
 * using Mockito's own mock creation API here is the intended public usage pattern of the class
 * under test (not an external mocking framework substituting the class under test).
 */
public class ReturnsDeepStubsTest {

    interface Foo {
        Bar getBar();
        String getString();
        int getInt();
    }

    interface Bar {
        Baz getBaz();
    }

    interface Baz {
        String getValue();
    }

    static final class FinalThing {
        // Final class cannot be subclassed/mocked by Mockito
    }

    interface HasFinal {
        FinalThing getFinalThing();
    }

    // ---------- Normal / Typical cases ----------

    @Test
    public void testAnswer_deepStub_returnsMockForInterfaceChain() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());

        Bar bar = foo.getBar();
        assertNotNull(bar);

        Baz baz = bar.getBaz();
        assertNotNull(baz);
    }

    @Test
    public void testAnswer_deepStub_cachesSameMockForRepeatedCalls() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());

        Bar bar1 = foo.getBar();
        Bar bar2 = foo.getBar();

        assertNotNull(bar1);
        assertSame(bar1, bar2);
    }

    @Test
    public void testActualParameterizedType_typical_returnsGenericMetadataSupport() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        ReturnsDeepStubs answer = new ReturnsDeepStubs();

        Object result = answer.actualParameterizedType(foo);

        assertNotNull(result);
    }

    // ---------- Edge cases ----------

    @Test
    public void testAnswer_nonMockableReturnType_returnsEmptyStringValue() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());

        String s = foo.getString();

        assertNotNull(s);
        assertEquals("", s);
    }

    @Test
    public void testAnswer_primitiveReturnType_returnsDefaultZeroValue() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());

        int i = foo.getInt();

        assertEquals(0, i);
    }

    @Test
    public void testAnswer_finalClassReturnType_returnsNullFromDelegate() {
        HasFinal hasFinal = mock(HasFinal.class, new ReturnsDeepStubs());

        FinalThing finalThing = hasFinal.getFinalThing();

        // Final classes cannot be mocked, so the delegate's empty value (null) is returned
        assertNull(finalThing);
    }

    // ---------- Exception cases ----------

    @Test(expected = Exception.class)
    public void testActualParameterizedType_nonMockObject_throwsException() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();

        // Passing a plain, non-mock object should cause the internal MockUtil handler lookup
        // to fail since it is not a mock.
        answer.actualParameterizedType(new Object());
    }

    @Test(expected = Exception.class)
    public void testActualParameterizedType_nullMock_throwsException() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();

        // Passing null should trigger an internal NullPointerException (or similar) because
        // the mock handler lookup cannot operate on a null reference.
        answer.actualParameterizedType(null);
    }
}
