package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

public class TypeBasedCandidateFilterTest {

    // Sample class with fields of various types used to obtain real Field objects via reflection
    static class SampleClass {
        private String stringField;
        private Integer integerField;
        private Object objectField;
    }

    // NOTE: OngoingInjecter interface definition is not provided in the given source.
    // Based on the real Mockito API, it is known to declare a single method: Object inject();
    // This assumption is required to create a compilable test double without using any mocking framework.
    static class SimpleOngoingInjecter implements OngoingInjecter {
        public Object inject() {
            return null;
        }
    }

    // Stub implementation of MockCandidateFilter (signature taken directly from the source code
    // under test) used to capture arguments passed by TypeBasedCandidateFilter to the next filter.
    static class CapturingFilter implements MockCandidateFilter {
        Collection<Object> capturedMocks;
        Field capturedField;
        Object capturedFieldInstance;
        OngoingInjecter toReturn = new SimpleOngoingInjecter();

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.capturedMocks = mocks;
            this.capturedField = field;
            this.capturedFieldInstance = fieldInstance;
            return toReturn;
        }
    }

    private CapturingFilter nextFilter;
    private TypeBasedCandidateFilter filter;

    @Before
    public void setUp() {
        nextFilter = new CapturingFilter();
        filter = new TypeBasedCandidateFilter(nextFilter);
    }

    @Test
    public void testFilterCandidate_matchingTypeMocks_passesFilteredListToNext() throws Exception {
        Field field = SampleClass.class.getDeclaredField("stringField");
        String mock1 = "mockString";
        Integer mock2 = 42;
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock1);
        mocks.add(mock2);

        Object fieldInstance = new SampleClass();
        OngoingInjecter result = filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(result);
        assertEquals(1, nextFilter.capturedMocks.size());
        assertTrue(nextFilter.capturedMocks.contains(mock1));
        assertFalse(nextFilter.capturedMocks.contains(mock2));
        assertSame(field, nextFilter.capturedField);
        assertSame(fieldInstance, nextFilter.capturedFieldInstance);
    }

    @Test
    public void testFilterCandidate_noMatchingTypeMocks_passesEmptyListToNext() throws Exception {
        Field field = SampleClass.class.getDeclaredField("integerField");
        String mock1 = "mockString";
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock1);

        Object fieldInstance = new SampleClass();
        filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(nextFilter.capturedMocks);
        assertTrue(nextFilter.capturedMocks.isEmpty());
    }

    @Test
    public void testFilterCandidate_emptyMocksCollection_passesEmptyListToNext() throws Exception {
        Field field = SampleClass.class.getDeclaredField("objectField");
        Collection<Object> mocks = new ArrayList<Object>();

        Object fieldInstance = new SampleClass();
        filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(nextFilter.capturedMocks);
        assertTrue(nextFilter.capturedMocks.isEmpty());
    }

    @Test
    public void testFilterCandidate_fieldInstanceNull_doesNotThrowAndPassesNullInstance() throws Exception {
        Field field = SampleClass.class.getDeclaredField("stringField");
        String mock1 = "mockString";
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock1);

        OngoingInjecter result = filter.filterCandidate(mocks, field, null);

        assertNotNull(result);
        assertNull(nextFilter.capturedFieldInstance);
    }

    @Test(expected = NullPointerException.class)
    public void testFilterCandidate_nullMocksCollection_throwsNullPointerException() throws Exception {
        Field field = SampleClass.class.getDeclaredField("stringField");
        filter.filterCandidate(null, field, new SampleClass());
    }

    @Test(expected = NullPointerException.class)
    public void testFilterCandidate_nullFieldWithNonEmptyMocks_throwsNullPointerException() throws Exception {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mockString");
        filter.filterCandidate(mocks, null, new SampleClass());
    }

    @Test
    public void testFilterCandidate_objectTypeField_matchesAllMocks() throws Exception {
        Field field = SampleClass.class.getDeclaredField("objectField");
        String mock1 = "mockString";
        Integer mock2 = 42;
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock1);
        mocks.add(mock2);

        filter.filterCandidate(mocks, field, new SampleClass());

        assertEquals(2, nextFilter.capturedMocks.size());
    }

    @Test
    public void testFilterCandidate_subclassMockAssignableToFieldType_matchesCandidate() throws Exception {
        Field field = SampleClass.class.getDeclaredField("objectField");
        StringBuilder mock1 = new StringBuilder("subtype instance");
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock1);

        filter.filterCandidate(mocks, field, new SampleClass());

        assertEquals(1, nextFilter.capturedMocks.size());
        assertTrue(nextFilter.capturedMocks.contains(mock1));
    }

    @Test
    public void testConstructor_storesNextFilterReference() {
        MockCandidateFilter customNext = new CapturingFilter();
        TypeBasedCandidateFilter f = new TypeBasedCandidateFilter(customNext);
        assertSame(customNext, f.next);
    }
}
