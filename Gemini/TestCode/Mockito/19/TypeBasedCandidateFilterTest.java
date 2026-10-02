package org.mockito.internal.configuration.injection.filter;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TypeBasedCandidateFilterTest {

    static class SampleHost {
        CharSequence charSequenceField;
        Number numberField;
        String stringField;
        List<String> listField;
    }

    private static class RecordingMockCandidateFilter implements MockCandidateFilter {
        Collection<Object> receivedMocks;
        Field receivedField;
        Object receivedFieldInstance;
        OngoingInjecter returnedInjecter = new OngoingInjecter() {
            public boolean thenInject() {
                return true;
            }
        };

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.receivedMocks = mocks;
            this.receivedField = field;
            this.receivedFieldInstance = fieldInstance;
            return returnedInjecter;
        }
    }

    @Test
    public void filterCandidate_matchingTypes_passesOnlyMatchingMocksToNextFilter() throws Exception {
        RecordingMockCandidateFilter nextFilter = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(nextFilter);

        Field field = SampleHost.class.getDeclaredField("charSequenceField");
        SampleHost hostInstance = new SampleHost();

        String stringMock = "aString";
        StringBuilder stringBuilderMock = new StringBuilder("aStringBuilder");
        Integer integerMock = 123;
        Double doubleMock = 45.67;

        List<Object> mocks = Arrays.asList(stringMock, integerMock, stringBuilderMock, doubleMock);

        OngoingInjecter result = filter.filterCandidate(mocks, field, hostInstance);

        Assert.assertSame(nextFilter.returnedInjecter, result);
        Assert.assertSame(field, nextFilter.receivedField);
        Assert.assertSame(hostInstance, nextFilter.receivedFieldInstance);

        Assert.assertNotNull(nextFilter.receivedMocks);
        Assert.assertEquals(2, nextFilter.receivedMocks.size());
        List<Object> receivedList = new ArrayList<Object>(nextFilter.receivedMocks);
        Assert.assertTrue(receivedList.contains(stringMock));
        Assert.assertTrue(receivedList.contains(stringBuilderMock));
        Assert.assertFalse(receivedList.contains(integerMock));
        Assert.assertFalse(receivedList.contains(doubleMock));
    }

    @Test
    public void filterCandidate_noMatchingTypes_passesEmptyCollectionToNextFilter() throws Exception {
        RecordingMockCandidateFilter nextFilter = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(nextFilter);

        Field field = SampleHost.class.getDeclaredField("numberField");
        SampleHost hostInstance = new SampleHost();

        List<Object> mocks = Arrays.<Object>asList("text1", "text2", new ArrayList<Object>());

        OngoingInjecter result = filter.filterCandidate(mocks, field, hostInstance);

        Assert.assertSame(nextFilter.returnedInjecter, result);
        Assert.assertNotNull(nextFilter.receivedMocks);
        Assert.assertTrue(nextFilter.receivedMocks.isEmpty());
    }

    @Test
    public void filterCandidate_allMatchingTypes_passesAllMocksToNextFilter() throws Exception {
        RecordingMockCandidateFilter nextFilter = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(nextFilter);

        Field field = SampleHost.class.getDeclaredField("numberField");
        SampleHost hostInstance = new SampleHost();

        Integer intMock = 1;
        Long longMock = 2L;
        Double doubleMock = 3.0;

        List<Object> mocks = Arrays.<Object>asList(intMock, longMock, doubleMock);

        OngoingInjecter result = filter.filterCandidate(mocks, field, hostInstance);

        Assert.assertSame(nextFilter.returnedInjecter, result);
        Assert.assertEquals(3, nextFilter.receivedMocks.size());
        List<Object> receivedList = new ArrayList<Object>(nextFilter.receivedMocks);
        Assert.assertEquals(mocks, receivedList);
    }

    @Test
    public void filterCandidate_emptyMocksCollection_passesEmptyCollectionToNextFilter() throws Exception {
        RecordingMockCandidateFilter nextFilter = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(nextFilter);

        Field field = SampleHost.class.getDeclaredField("stringField");
        SampleHost hostInstance = new SampleHost();

        OngoingInjecter result = filter.filterCandidate(Collections.emptyList(), field, hostInstance);

        Assert.assertSame(nextFilter.returnedInjecter, result);
        Assert.assertNotNull(nextFilter.receivedMocks);
        Assert.assertTrue(nextFilter.receivedMocks.isEmpty());
    }

    @Test
    public void filterCandidate_nullFieldInstance_passesNullFieldInstanceToNextFilter() throws Exception {
        RecordingMockCandidateFilter nextFilter = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(nextFilter);

        Field field = SampleHost.class.getDeclaredField("stringField");
        List<Object> mocks = Arrays.<Object>asList("value");

        OngoingInjecter result = filter.filterCandidate(mocks, field, null);

        Assert.assertSame(nextFilter.returnedInjecter, result);
        Assert.assertNull(nextFilter.receivedFieldInstance);
        Assert.assertEquals(1, nextFilter.receivedMocks.size());
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_nullMocks_throwsNullPointerException() throws Exception {
        RecordingMockCandidateFilter nextFilter = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(nextFilter);

        Field field = SampleHost.class.getDeclaredField("stringField");
        filter.filterCandidate(null, field, new SampleHost());
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_nullField_throwsNullPointerException() {
        RecordingMockCandidateFilter nextFilter = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(nextFilter);

        List<Object> mocks = Arrays.<Object>asList("value");
        filter.filterCandidate(mocks, null, new SampleHost());
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_nullNextFilter_throwsNullPointerException() throws Exception {
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(null);

        Field field = SampleHost.class.getDeclaredField("stringField");
        List<Object> mocks = Arrays.<Object>asList("value");
        filter.filterCandidate(mocks, field, new SampleHost());
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_collectionContainsNullMock_throwsNullPointerException() throws Exception {
        RecordingMockCandidateFilter nextFilter = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(nextFilter);

        Field field = SampleHost.class.getDeclaredField("stringField");
        List<Object> mocks = Collections.singletonList(null);

        filter.filterCandidate(mocks, field, new SampleHost());
    }
}
