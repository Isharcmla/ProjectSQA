package org.mockito.internal.configuration.injection.filter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NameBasedCandidateFilterTest {

    private static class DummyClass {
        private String targetField;
        private String otherField;
    }

    private static class TestOngoingInjecter implements OngoingInjecter {
        private final Object injected;

        public TestOngoingInjecter(Object injected) {
            this.injected = injected;
        }

        public Object thenInject() {
            return injected;
        }
    }

    private static class RecordingCandidateFilter implements MockCandidateFilter {
        private Collection<Object> capturedMocks;
        private Field capturedField;
        private Object capturedFieldInstance;
        private OngoingInjecter injecterToReturn = new TestOngoingInjecter(null);

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.capturedMocks = mocks;
            this.capturedField = field;
            this.capturedFieldInstance = fieldInstance;
            return injecterToReturn;
        }
    }

    private RecordingCandidateFilter nextFilter;
    private NameBasedCandidateFilter filter;
    private Field targetField;
    private Field otherField;
    private DummyClass dummyInstance;

    @Before
    public void setUp() throws Exception {
        nextFilter = new RecordingCandidateFilter();
        filter = new NameBasedCandidateFilter(nextFilter);
        targetField = DummyClass.class.getDeclaredField("targetField");
        otherField = DummyClass.class.getDeclaredField("otherField");
        dummyInstance = new DummyClass();
    }

    @Test
    public void testFilterCandidate_emptyMocks_delegatesToNext() {
        Collection<Object> mocks = Collections.emptyList();
        OngoingInjecter result = filter.filterCandidate(mocks, targetField, dummyInstance);

        Assert.assertNotNull(result);
        Assert.assertSame(nextFilter.injecterToReturn, result);
        Assert.assertEquals(0, nextFilter.capturedMocks.size());
        Assert.assertSame(targetField, nextFilter.capturedField);
        Assert.assertSame(dummyInstance, nextFilter.capturedFieldInstance);
    }

    @Test
    public void testFilterCandidate_singleMock_delegatesToNextDirectlyWithoutFiltering() {
        Object mock = Mockito.mock(List.class, "unmatchedName");
        Collection<Object> mocks = Collections.singletonList(mock);

        OngoingInjecter result = filter.filterCandidate(mocks, targetField, dummyInstance);

        Assert.assertSame(nextFilter.injecterToReturn, result);
        Assert.assertEquals(1, nextFilter.capturedMocks.size());
        Assert.assertSame(mock, nextFilter.capturedMocks.iterator().next());
        Assert.assertSame(targetField, nextFilter.capturedField);
        Assert.assertSame(dummyInstance, nextFilter.capturedFieldInstance);
    }

    @Test
    public void testFilterCandidate_multipleMocks_matchesByName() {
        Object mockMatching = Mockito.mock(List.class, "targetField");
        Object mockOther = Mockito.mock(List.class, "otherField");
        Collection<Object> mocks = Arrays.asList(mockMatching, mockOther);

        OngoingInjecter result = filter.filterCandidate(mocks, targetField, dummyInstance);

        Assert.assertSame(nextFilter.injecterToReturn, result);
        Assert.assertEquals(1, nextFilter.capturedMocks.size());
        Assert.assertTrue(nextFilter.capturedMocks.contains(mockMatching));
        Assert.assertFalse(nextFilter.capturedMocks.contains(mockOther));
        Assert.assertSame(targetField, nextFilter.capturedField);
        Assert.assertSame(dummyInstance, nextFilter.capturedFieldInstance);
    }

    @Test
    public void testFilterCandidate_multipleMocks_noMatchFound() {
        Object mock1 = Mockito.mock(List.class, "name1");
        Object mock2 = Mockito.mock(List.class, "name2");
        Collection<Object> mocks = Arrays.asList(mock1, mock2);

        OngoingInjecter result = filter.filterCandidate(mocks, targetField, dummyInstance);

        Assert.assertSame(nextFilter.injecterToReturn, result);
        Assert.assertEquals(0, nextFilter.capturedMocks.size());
        Assert.assertSame(targetField, nextFilter.capturedField);
        Assert.assertSame(dummyInstance, nextFilter.capturedFieldInstance);
    }

    @Test
    public void testFilterCandidate_multipleMocks_multipleMatchesFound() {
        Object mock1 = Mockito.mock(List.class, "targetField");
        Object mock2 = Mockito.mock(List.class, "targetField");
        Object mock3 = Mockito.mock(List.class, "otherField");
        Collection<Object> mocks = Arrays.asList(mock1, mock2, mock3);

        OngoingInjecter result = filter.filterCandidate(mocks, targetField, dummyInstance);

        Assert.assertSame(nextFilter.injecterToReturn, result);
        Assert.assertEquals(2, nextFilter.capturedMocks.size());
        Assert.assertTrue(nextFilter.capturedMocks.contains(mock1));
        Assert.assertTrue(nextFilter.capturedMocks.contains(mock2));
        Assert.assertFalse(nextFilter.capturedMocks.contains(mock3));
    }

    @Test(expected = NullPointerException.class)
    public void testFilterCandidate_nullMocks_throwsNullPointerException() {
        filter.filterCandidate(null, targetField, dummyInstance);
    }

    @Test(expected = NullPointerException.class)
    public void testFilterCandidate_nullFieldWithMultipleMocks_throwsNullPointerException() {
        Object mock1 = Mockito.mock(List.class, "targetField");
        Object mock2 = Mockito.mock(List.class, "otherField");
        Collection<Object> mocks = Arrays.asList(mock1, mock2);

        filter.filterCandidate(mocks, null, dummyInstance);
    }

    @Test
    public void testFilterCandidate_nullFieldInstanceWithMultipleMocks_accepted() {
        Object mock1 = Mockito.mock(List.class, "targetField");
        Object mock2 = Mockito.mock(List.class, "otherField");
        Collection<Object> mocks = Arrays.asList(mock1, mock2);

        OngoingInjecter result = filter.filterCandidate(mocks, targetField, null);

        Assert.assertNotNull(result);
        Assert.assertNull(nextFilter.capturedFieldInstance);
    }
}
