package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class NameBasedCandidateFilterTest {

    // Stub implementation of MockCandidateFilter used only to record/capture
    // the arguments passed by the class under test. This is NOT a mocking
    // framework usage - it's a hand-written test double implementing the
    // real interface, which is allowed and necessary to verify delegation.
    private static class RecordingFilter implements MockCandidateFilter {
        Collection<Object> capturedMocks;
        Field capturedField;
        Object capturedFieldInstance;
        OngoingInjecter toReturn;

        RecordingFilter(OngoingInjecter toReturn) {
            this.toReturn = toReturn;
        }

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.capturedMocks = mocks;
            this.capturedField = field;
            this.capturedFieldInstance = fieldInstance;
            return toReturn;
        }
    }

    // Simple hand-written stub implementation of OngoingInjecter (real interface, not mocked)
    private static class StubInjecter implements OngoingInjecter {
        public Object thenInject() {
            return null;
        }
    }

    static class FieldHolder {
        private Object someField;
        private Object otherField;
    }

    private Field someField;
    private Field otherField;

    @Before
    public void setUp() throws Exception {
        someField = FieldHolder.class.getDeclaredField("someField");
        otherField = FieldHolder.class.getDeclaredField("otherField");
    }

    @Test
    public void testFilterCandidate_singleMock_delegatesDirectlyToNextWithoutNameFiltering() {
        Object mock = new Object();
        List<Object> mocks = new ArrayList<Object>();
        mocks.add(mock);

        OngoingInjecter expectedResult = new StubInjecter();
        RecordingFilter next = new RecordingFilter(expectedResult);
        NameBasedCandidateFilter filter = new NameBasedCandidateFilter(next);

        FieldHolder holder = new FieldHolder();
        OngoingInjecter result = filter.filterCandidate(mocks, someField, holder);

        assertSame(expectedResult, result);
        assertSame(mocks, next.capturedMocks);
        assertSame(someField, next.capturedField);
        assertSame(holder, next.capturedFieldInstance);
    }

    @Test
    public void testFilterCandidate_emptyMocks_delegatesDirectlyToNext() {
        List<Object> mocks = new ArrayList<Object>();

        OngoingInjecter expectedResult = new StubInjecter();
        RecordingFilter next = new RecordingFilter(expectedResult);
        NameBasedCandidateFilter filter = new NameBasedCandidateFilter(next);

        FieldHolder holder = new FieldHolder();
        OngoingInjecter result = filter.filterCandidate(mocks, someField, holder);

        assertSame(expectedResult, result);
        assertSame(mocks, next.capturedMocks);
        assertTrue(next.capturedMocks.isEmpty());
    }

    @Test
    public void testFilterCandidate_multipleMocksWithNameMatch_filtersByFieldName() {
        // NOTE: MockUtil.getMockName(...) requires an actual Mockito-created mock
        // object, otherwise it throws an exception. Since this class is part of
        // Mockito's internal injection mechanism, we must use real mock instances
        // (created via Mockito.mock) as test data - this is not mocking the
        // behavior under test, it is providing valid input required by the SUT.
        Object matchingMock = Mockito.mock(Object.class, Mockito.withSettings().name("someField"));
        Object nonMatchingMock = Mockito.mock(Object.class, Mockito.withSettings().name("otherField"));

        List<Object> mocks = new ArrayList<Object>();
        mocks.add(matchingMock);
        mocks.add(nonMatchingMock);

        OngoingInjecter expectedResult = new StubInjecter();
        RecordingFilter next = new RecordingFilter(expectedResult);
        NameBasedCandidateFilter filter = new NameBasedCandidateFilter(next);

        FieldHolder holder = new FieldHolder();
        OngoingInjecter result = filter.filterCandidate(mocks, someField, holder);

        assertSame(expectedResult, result);
        assertNotNull(next.capturedMocks);
        assertEquals(1, next.capturedMocks.size());
        assertTrue(next.capturedMocks.contains(matchingMock));
        assertFalse(next.capturedMocks.contains(nonMatchingMock));
        assertSame(someField, next.capturedField);
        assertSame(holder, next.capturedFieldInstance);
    }

    @Test
    public void testFilterCandidate_multipleMocksNoNameMatch_passesEmptyListToNext() {
        Object mock1 = Mockito.mock(Object.class, Mockito.withSettings().name("foo"));
        Object mock2 = Mockito.mock(Object.class, Mockito.withSettings().name("bar"));

        List<Object> mocks = new ArrayList<Object>();
        mocks.add(mock1);
        mocks.add(mock2);

        OngoingInjecter expectedResult = new StubInjecter();
        RecordingFilter next = new RecordingFilter(expectedResult);
        NameBasedCandidateFilter filter = new NameBasedCandidateFilter(next);

        FieldHolder holder = new FieldHolder();
        OngoingInjecter result = filter.filterCandidate(mocks, someField, holder);

        assertSame(expectedResult, result);
        assertNotNull(next.capturedMocks);
        assertTrue(next.capturedMocks.isEmpty());
    }

    @Test(expected = Exception.class)
    public void testFilterCandidate_multipleNonMockObjects_throwsExceptionFromMockUtil() {
        // When mocks.size() > 1 and the objects are plain (non-mock) objects,
        // MockUtil.getMockName will throw an exception (e.g. NotAMockException)
        // because they are not real Mockito mocks.
        Object plain1 = new Object();
        Object plain2 = new Object();

        List<Object> mocks = new ArrayList<Object>();
        mocks.add(plain1);
        mocks.add(plain2);

        RecordingFilter next = new RecordingFilter(new StubInjecter());
        NameBasedCandidateFilter filter = new NameBasedCandidateFilter(next);

        FieldHolder holder = new FieldHolder();
        filter.filterCandidate(mocks, someField, holder);
    }

    @Test
    public void testFilterCandidate_nullFieldInstance_stillDelegatesCorrectly() {
        List<Object> mocks = new ArrayList<Object>();
        mocks.add(new Object());

        OngoingInjecter expectedResult = new StubInjecter();
        RecordingFilter next = new RecordingFilter(expectedResult);
        NameBasedCandidateFilter filter = new NameBasedCandidateFilter(next);

        OngoingInjecter result = filter.filterCandidate(mocks, someField, null);

        assertSame(expectedResult, result);
        assertNull(next.capturedFieldInstance);
    }

    @Test
    public void testFilterCandidate_withOtherFieldName_noMatchFound() {
        Object mock1 = Mockito.mock(Object.class, Mockito.withSettings().name("someField"));
        Object mock2 = Mockito.mock(Object.class, Mockito.withSettings().name("someField"));

        List<Object> mocks = new ArrayList<Object>();
        mocks.add(mock1);
        mocks.add(mock2);

        OngoingInjecter expectedResult = new StubInjecter();
        RecordingFilter next = new RecordingFilter(expectedResult);
        NameBasedCandidateFilter filter = new NameBasedCandidateFilter(next);

        FieldHolder holder = new FieldHolder();
        OngoingInjecter result = filter.filterCandidate(mocks, otherField, holder);

        assertSame(expectedResult, result);
        assertNotNull(next.capturedMocks);
        assertTrue(next.capturedMocks.isEmpty());
        assertSame(otherField, next.capturedField);
    }
}
