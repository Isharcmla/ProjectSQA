package org.mockito.internal.configuration.injection;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FinalMockCandidateFilterTest {

    private final FinalMockCandidateFilter filter = new FinalMockCandidateFilter();

    static class DummyTarget {
        private String stringField;
        private int intField;
    }

    @Test
    public void testFilterCandidate_emptyMocks_returnsOngoingInjecterReturningFalse() throws Exception {
        DummyTarget target = new DummyTarget();
        Field field = DummyTarget.class.getDeclaredField("stringField");
        List<Object> mocks = Collections.emptyList();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Assert.assertNotNull(injecter);

        boolean result = injecter.thenInject();
        Assert.assertFalse(result);
        Assert.assertNull(target.stringField);
    }

    @Test
    public void testFilterCandidate_multipleMocks_returnsOngoingInjecterReturningFalse() throws Exception {
        DummyTarget target = new DummyTarget();
        Field field = DummyTarget.class.getDeclaredField("stringField");
        List<Object> mocks = Arrays.asList(new Object(), new Object());

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Assert.assertNotNull(injecter);

        boolean result = injecter.thenInject();
        Assert.assertFalse(result);
        Assert.assertNull(target.stringField);
    }

    @Test
    public void testFilterCandidate_singleMatchingMock_injectsSuccessfully() throws Exception {
        DummyTarget target = new DummyTarget();
        Field field = DummyTarget.class.getDeclaredField("stringField");
        String mockValue = "injectedString";
        List<Object> mocks = Collections.singletonList((Object) mockValue);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Assert.assertNotNull(injecter);

        boolean result = injecter.thenInject();
        Assert.assertTrue(result);
        Assert.assertEquals("injectedString", target.stringField);
    }

    @Test(expected = MockitoException.class)
    public void testFilterCandidate_singleMockIncompatibleType_throwsMockitoException() throws Exception {
        DummyTarget target = new DummyTarget();
        Field field = DummyTarget.class.getDeclaredField("intField");
        String incompatibleMockValue = "notAnInt";
        List<Object> mocks = Collections.singletonList((Object) incompatibleMockValue);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Assert.assertNotNull(injecter);

        injecter.thenInject();
    }

    @Test
    public void testFilterCandidate_singleMockNullInstance_throwsMockitoExceptionWithCorrectMessage() throws Exception {
        Field field = DummyTarget.class.getDeclaredField("stringField");
        List<Object> mocks = Collections.singletonList((Object) "injectedValue");

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, null);
        Assert.assertNotNull(injecter);

        try {
            injecter.thenInject();
            Assert.fail("Expected MockitoException to be thrown");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().contains("Problems injecting dependency in stringField"));
        }
    }
}
