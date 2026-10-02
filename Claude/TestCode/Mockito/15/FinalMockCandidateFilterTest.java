import org.junit.Test;
import org.junit.Assert;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.configuration.injection.MockCandidateFilter.OngoingInjecter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FinalMockCandidateFilterTest {

    // Simple holder class used as target for field injection
    static class FieldHolder {
        public String stringField;
        public Integer integerField;
        private Object privateField;
    }

    private FinalMockCandidateFilter filter;

    @org.junit.Before
    public void setUp() {
        filter = new FinalMockCandidateFilter();
    }

    @Test
    public void testFilterCandidate_singleMatchingMock_injectsSuccessfully() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getField("stringField");

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mockedValue");

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);
        boolean result = injecter.thenInject();

        Assert.assertTrue(result);
        Assert.assertEquals("mockedValue", holder.stringField);
    }

    @Test
    public void testFilterCandidate_singleMatchingMockOnPrivateField_injectsSuccessfully() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getDeclaredField("privateField");

        Collection<Object> mocks = new ArrayList<Object>();
        Object mockObj = new Object();
        mocks.add(mockObj);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);
        boolean result = injecter.thenInject();

        Assert.assertTrue(result);
        field.setAccessible(true);
        Assert.assertSame(mockObj, field.get(holder));
    }

    @Test
    public void testFilterCandidate_emptyMocksCollection_returnsFalseInjecter() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getField("stringField");

        Collection<Object> mocks = Collections.emptyList();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);
        boolean result = injecter.thenInject();

        Assert.assertFalse(result);
        Assert.assertNull(holder.stringField);
    }

    @Test
    public void testFilterCandidate_multipleMocksInCollection_returnsFalseInjecter() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getField("stringField");

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("firstMock");
        mocks.add("secondMock");

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);
        boolean result = injecter.thenInject();

        Assert.assertFalse(result);
        Assert.assertNull(holder.stringField);
    }

    @Test(expected = MockitoException.class)
    public void testFilterCandidate_incompatibleTypeMock_throwsMockitoException() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getField("integerField");

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("incompatibleStringValue");

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);
        injecter.thenInject();
    }

    @Test(expected = MockitoException.class)
    public void testFilterCandidate_nullFieldInstance_throwsMockitoException() throws Exception {
        Field field = FieldHolder.class.getField("stringField");

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mockedValue");

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, null);
        injecter.thenInject();
    }

    @Test
    public void testFilterCandidate_singleNullMockCandidate_injectsNullSuccessfully() throws Exception {
        FieldHolder holder = new FieldHolder();
        holder.stringField = "initialValue";
        Field field = FieldHolder.class.getField("stringField");

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(null);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);
        boolean result = injecter.thenInject();

        Assert.assertTrue(result);
        Assert.assertNull(holder.stringField);
    }
}
