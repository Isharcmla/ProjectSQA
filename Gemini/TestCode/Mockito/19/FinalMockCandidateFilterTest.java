package org.mockito.internal.configuration.injection.filter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FinalMockCandidateFilterTest {

    private FinalMockCandidateFilter filter;

    @Before
    public void setUp() {
        filter = new FinalMockCandidateFilter();
    }

    public static class SampleWithSetter {
        private String message;
        private boolean setterInvoked = false;

        public void setMessage(String message) {
            this.message = message;
            this.setterInvoked = true;
        }

        public String getMessage() {
            return message;
        }

        public boolean isSetterInvoked() {
            return setterInvoked;
        }
    }

    public static class SampleWithoutSetter {
        private String message;

        public String getMessage() {
            return message;
        }
    }

    @Test
    public void testFilterCandidate_emptyMocks_returnsOngoingInjecterWithNull() {
        SampleWithoutSetter target = new SampleWithoutSetter();
        Field[] fields = SampleWithoutSetter.class.getDeclaredFields();
        Field field = fields[0];

        OngoingInjecter injecter = filter.filterCandidate(Collections.emptyList(), field, target);
        Object result = injecter.thenInject();

        Assert.assertNull(result);
        Assert.assertNull(target.getMessage());
    }

    @Test
    public void testFilterCandidate_multipleMocks_returnsOngoingInjecterWithNull() {
        SampleWithoutSetter target = new SampleWithoutSetter();
        Field[] fields = SampleWithoutSetter.class.getDeclaredFields();
        Field field = fields[0];

        List<Object> mocks = Arrays.asList("mock1", "mock2");
        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Object result = injecter.thenInject();

        Assert.assertNull(result);
        Assert.assertNull(target.getMessage());
    }

    @Test
    public void testFilterCandidate_singleMock_injectsViaPropertySetter() throws Exception {
        SampleWithSetter target = new SampleWithSetter();
        Field field = SampleWithSetter.class.getDeclaredField("message");

        String mockValue = "injectedMessage";
        List<Object> mocks = Collections.singletonList(mockValue);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Object result = injecter.thenInject();

        Assert.assertEquals(mockValue, result);
        Assert.assertEquals(mockValue, target.getMessage());
        Assert.assertTrue(target.isSetterInvoked());
    }

    @Test
    public void testFilterCandidate_singleMock_injectsViaFieldSetterWhenNoSetter() throws Exception {
        SampleWithoutSetter target = new SampleWithoutSetter();
        Field field = SampleWithoutSetter.class.getDeclaredField("message");

        String mockValue = "directFieldInjection";
        List<Object> mocks = Collections.singletonList(mockValue);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Object result = injecter.thenInject();

        Assert.assertEquals(mockValue, result);
        Assert.assertEquals(mockValue, target.getMessage());
    }

    @Test(expected = MockitoException.class)
    public void testFilterCandidate_typeMismatch_throwsMockitoException() throws Exception {
        SampleWithoutSetter target = new SampleWithoutSetter();
        Field field = SampleWithoutSetter.class.getDeclaredField("message");

        Integer incompatibleMock = 12345;
        List<Object> mocks = Collections.singletonList(incompatibleMock);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        injecter.thenInject();
    }
}
