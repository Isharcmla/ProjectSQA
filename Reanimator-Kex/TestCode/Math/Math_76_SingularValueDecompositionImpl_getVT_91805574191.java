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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getVT_91805574191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39636;

    public SingularValueDecompositionImpl_getVT_91805574191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39636 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term39483 = (double[]) newDoubleArray(0);
        Object term39748 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(term39636, term39636.getClass(), "cachedVt", null);
        setField(term39636, term39636.getClass(), "cachedV", null);
        setField(term39636, term39636.getClass(), "singularValues", term39483);
        setIntField(term39636, term39636.getClass(), "m", -2147483648);
        setIntField(term39636, term39636.getClass(), "n", -2147483647);
        setField(term39636, term39636.getClass(), "eigenDecomposition", term39748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getVT", argTypes, term39636, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


