package org.mockito.internal.configuration.injection.filter;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MockCandidateFilterTest {

    private static class SampleTarget {
        public String sampleField = "initial";
    }

    @Test
    public void testFilterCandidate_validInputs_returnsOngoingInjecter() throws NoSuchFieldException {
        Field field = SampleTarget.class.getField("sampleField");
        SampleTarget targetInstance = new SampleTarget();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mockValue");

        final OngoingInjecter expectedInjecter = new OngoingInjecter() {
            @Override
            public boolean thenInject() {
                return true;
            }
        };

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> m, Field f, Object fieldInstance) {
                Assert.assertEquals(mocks, m);
                Assert.assertEquals(field, f);
                Assert.assertEquals(targetInstance, fieldInstance);
                return expectedInjecter;
            }
        };

        OngoingInjecter result = filter.filterCandidate(mocks, field, targetInstance);

        Assert.assertNotNull(result);
        Assert.assertSame(expectedInjecter, result);
        Assert.assertTrue(result.thenInject());
    }

    @Test
    public void testFilterCandidate_emptyMocksCollection_returnsOngoingInjecter() throws NoSuchFieldException {
        Field field = SampleTarget.class.getField("sampleField");
        SampleTarget targetInstance = new SampleTarget();
        Collection<Object> mocks = Collections.emptyList();

        final OngoingInjecter expectedInjecter = new OngoingInjecter() {
            @Override
            public boolean thenInject() {
                return false;
            }
        };

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> m, Field f, Object fieldInstance) {
                if (m.isEmpty()) {
                    return expectedInjecter;
                }
                return null;
            }
        };

        OngoingInjecter result = filter.filterCandidate(mocks, field, targetInstance);

        Assert.assertNotNull(result);
        Assert.assertFalse(result.thenInject());
    }

    @Test
    public void testFilterCandidate_nullArguments_handlesGracefully() {
        final OngoingInjecter nullObjectInjecter = new OngoingInjecter() {
            @Override
            public boolean thenInject() {
                return false;
            }
        };

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                if (mocks == null || fieldToBeInjected == null || fieldInstance == null) {
                    return nullObjectInjecter;
                }
                return null;
            }
        };

        OngoingInjecter resultAllNull = filter.filterCandidate(null, null, null);
        Assert.assertSame(nullObjectInjecter, resultAllNull);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilterCandidate_invalidState_throwsException() throws NoSuchFieldException {
        Field field = SampleTarget.class.getField("sampleField");
        SampleTarget targetInstance = new SampleTarget();

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                throw new IllegalArgumentException("Invalid candidate filter request");
            }
        };

        filter.filterCandidate(Collections.emptyList(), field, targetInstance);
    }

    @Test
    public void testInterfaceContract_methodSignature() throws NoSuchMethodException {
        Method method = MockCandidateFilter.class.getMethod(
                "filterCandidate",
                Collection.class,
                Field.class,
                Object.class
        );

        Assert.assertNotNull(method);
        Assert.assertEquals(OngoingInjecter.class, method.getReturnType());
        Assert.assertTrue(MockCandidateFilter.class.isInterface());
    }
}
