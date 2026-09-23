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

public class SingularValueDecompositionImpl_getSolver_1804940021149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82817;

    public SingularValueDecompositionImpl_getSolver_1804940021149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82817 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term82659 = (double[]) newDoubleArray(0);
        Object term82929 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term83037 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term82817, term82817.getClass(), "singularValues", term82659);
        setField(term82817, term82817.getClass(), "cachedUt", null);
        setField(term82817, term82817.getClass(), "cachedU", null);
        setIntField(term82817, term82817.getClass(), "m", -2147483648);
        setIntField(term82817, term82817.getClass(), "n", -2147483648);
        setField(term82929, term82929.getClass(), "cachedV", term83037);
        setField(term82817, term82817.getClass(), "eigenDecomposition", term82929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolver", argTypes, term82817, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


