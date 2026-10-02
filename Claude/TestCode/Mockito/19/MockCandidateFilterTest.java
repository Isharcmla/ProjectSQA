package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

public class MockCandidateFilterTest {

    // Dummy field holder class to obtain a real Field object for testing
    private static class Dummy {
        public String someField;
    }

    // Simple test double implementing OngoingInjecter for return value verification
    private static class SimpleOngoingInjecter implements OngoingInjecter {
        private final Object valueToInject;

        SimpleOngoingInjecter(Object valueToInject) {
            this.valueToInject = valueToInject;
        }

        @Override
        public Object thenInject() {
            return valueToInject;
        }
    }

    // Normal implementation: returns an OngoingInjecter wrapping the first mock if present
    private static class NormalFilter implements MockCandidateFilter {
        @Override
        public OngoingInjecter filterCandidate(
                Collection<Object> mocks,
                Field fieldToBeInjected,
                Object fieldInstance
        ) {
            if (mocks == null || mocks.isEmpty()) {
                return null;
            }
            Object first = mocks.iterator().next();
            return new SimpleOngoingInjecter(first);
        }
    }

    // Implementation that throws an exception under certain conditions
    private static class ThrowingFilter implements MockCandidateFilter {
        @Override
        public OngoingInjecter filterCandidate(
                Collection<Object> mocks,
                Field fieldToBeInjected,
                Object fieldInstance
        ) {
            if (fieldToBeInjected == null) {
                throw new IllegalArgumentException("fieldToBeInjected cannot be null");
            }
            if (mocks == null) {
                throw new NullPointerException("mocks cannot be null");
            }
            return new SimpleOngoingInjecter(fieldInstance);
        }
    }

    private Field dummyField;

    @Before
    public void setUp() throws Exception {
        dummyField = Dummy.class.getDeclaredField("someField");
    }

    @Test
    public void testFilterCandidate_normalInput_returnsOngoingInjecterWithFirstMock() {
        MockCandidateFilter filter = new NormalFilter();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mock1");
        mocks.add("mock2");
        Object fieldInstance = new Object();

        OngoingInjecter result = filter.filterCandidate(mocks, dummyField, fieldInstance);

        assertNotNull(result);
        assertEquals("mock1", result.thenInject());
    }

    @Test
    public void testFilterCandidate_emptyMocksCollection_returnsNull() {
        MockCandidateFilter filter = new NormalFilter();
        Collection<Object> mocks = Collections.emptyList();
        Object fieldInstance = new Object();

        OngoingInjecter result = filter.filterCandidate(mocks, dummyField, fieldInstance);

        assertNull(result);
    }

    @Test
    public void testFilterCandidate_nullMocksCollection_returnsNull() {
        MockCandidateFilter filter = new NormalFilter();
        Object fieldInstance = new Object();

        OngoingInjecter result = filter.filterCandidate(null, dummyField, fieldInstance);

        assertNull(result);
    }

    @Test
    public void testFilterCandidate_nullFieldInstance_doesNotThrow() {
        MockCandidateFilter filter = new NormalFilter();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("onlyMock");

        OngoingInjecter result = filter.filterCandidate(mocks, dummyField, null);

        assertNotNull(result);
        assertEquals("onlyMock", result.thenInject());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilterCandidate_nullFieldToBeInjected_throwsIllegalArgumentException() {
        MockCandidateFilter filter = new ThrowingFilter();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mock1");

        filter.filterCandidate(mocks, null, new Object());
    }

    @Test(expected = NullPointerException.class)
    public void testFilterCandidate_nullMocksCollectionWithThrowingFilter_throwsNullPointerException() {
        MockCandidateFilter filter = new ThrowingFilter();

        filter.filterCandidate(null, dummyField, new Object());
    }

    @Test
    public void testFilterCandidate_validInputsWithThrowingFilter_returnsOngoingInjecter() {
        MockCandidateFilter filter = new ThrowingFilter();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mockValue");
        Object fieldInstance = "someInstance";

        OngoingInjecter result = filter.filterCandidate(mocks, dummyField, fieldInstance);

        assertNotNull(result);
        assertEquals("someInstance", result.thenInject());
    }

    @Test
    public void testFilterCandidate_emptyMocksWithThrowingFilter_doesNotThrowAndReturnsInjecter() {
        MockCandidateFilter filter = new ThrowingFilter();
        Collection<Object> mocks = new ArrayList<Object>();
        Object fieldInstance = new Object();

        OngoingInjecter result = filter.filterCandidate(mocks, dummyField, fieldInstance);

        assertNotNull(result);
        assertSame(fieldInstance, result.thenInject());
    }

    @Test
    public void testFilterCandidate_multipleMocksInCollection_returnsFirstOne() {
        MockCandidateFilter filter = new NormalFilter();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("firstMock");
        mocks.add("secondMock");
        mocks.add("thirdMock");
        Object fieldInstance = new Object();

        OngoingInjecter result = filter.filterCandidate(mocks, dummyField, fieldInstance);

        assertNotNull(result);
        assertEquals("firstMock", result.thenInject());
    }
}
