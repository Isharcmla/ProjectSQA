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

public class SingularValueDecompositionImpl_getVT_918055741138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67243;

    public SingularValueDecompositionImpl_getVT_918055741138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67243 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term67087 = (double[]) newDoubleArray(0);
        Object term67355 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term67457 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term67243, term67243.getClass(), "cachedVt", null);
        setField(term67243, term67243.getClass(), "cachedV", null);
        setField(term67243, term67243.getClass(), "singularValues", term67087);
        setIntField(term67243, term67243.getClass(), "m", -2147483648);
        setIntField(term67243, term67243.getClass(), "n", -2147483647);
        setField(term67355, term67355.getClass(), "cachedV", term67457);
        setField(term67243, term67243.getClass(), "eigenDecomposition", term67355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getVT", argTypes, term67243, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


