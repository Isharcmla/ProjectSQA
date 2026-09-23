package org.apache.commons.math.linear;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getU_2092321490151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83830;

    public SingularValueDecompositionImpl_getU_2092321490151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83830 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term83675 = (double[]) newDoubleArray(0);
        Object term83942 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term84050 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term83830, term83830.getClass(), "cachedU", null);
        setField(term83830, term83830.getClass(), "singularValues", term83675);
        setIntField(term83830, term83830.getClass(), "m", -2147483648);
        setIntField(term83830, term83830.getClass(), "n", -2147483647);
        setField(term83942, term83942.getClass(), "cachedV", term84050);
        setField(term83830, term83830.getClass(), "eigenDecomposition", term83942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getU", argTypes, term83830, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


