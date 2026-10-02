import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

public class FinalMockCandidateFilterTest {

    private FinalMockCandidateFilter filter = new FinalMockCandidateFilter();

    static class WithSetter {
        private String value;
        public String getValue() { return value; }
        public void setValue(String value) { this.value = value; }
    }

    static class WithFieldOnly {
        public String value;
    }

    static class WithIncompatibleField {
        public String value;
    }

    @Test
    public void testFilterCandidate_singleMockWithSetter_injectsViaSetter() throws Exception {
        WithSetter instance = new WithSetter();
        Field field = WithSetter.class.getDeclaredField("value");
        String mock = "mockValue";
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, instance);
        Object result = injecter.thenInject();

        assertEquals(mock, result);
        assertEquals(mock, instance.getValue());
    }

    @Test
    public void testFilterCandidate_singleMockWithoutSetter_injectsViaField() throws Exception {
        WithFieldOnly instance = new WithFieldOnly();
        Field field = WithFieldOnly.class.getDeclaredField("value");
        String mock = "fieldValue";
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, instance);
        Object result = injecter.thenInject();

        assertEquals(mock, result);
        assertEquals(mock, instance.value);
    }

    @Test
    public void testFilterCandidate_emptyMocks_returnsNullInjecter() {
        Collection<Object> mocks = new ArrayList<Object>();

        OngoingInjecter injecter = filter.filterCandidate(mocks, null, null);
        Object result = injecter.thenInject();

        assertNull(result);
    }

    @Test
    public void testFilterCandidate_multipleMocks_returnsNullInjecter() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mock1");
        mocks.add("mock2");

        OngoingInjecter injecter = filter.filterCandidate(mocks, null, null);
        Object result = injecter.thenInject();

        assertNull(result);
    }

    @Test(expected = MockitoException.class)
    public void testFilterCandidate_incompatibleTypeDuringInjection_throwsMockitoException() throws Exception {
        WithIncompatibleField instance = new WithIncompatibleField();
        Field field = WithIncompatibleField.class.getDeclaredField("value");
        Integer mock = Integer.valueOf(123);
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, instance);
        injecter.thenInject();
    }

    @Test
    public void testFilterCandidate_singleMockReturnedNotNull() throws Exception {
        WithFieldOnly instance = new WithFieldOnly();
        Field field = WithFieldOnly.class.getDeclaredField("value");
        String mock = "anotherValue";
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, instance);

        assertNotNull(injecter);
    }
}
