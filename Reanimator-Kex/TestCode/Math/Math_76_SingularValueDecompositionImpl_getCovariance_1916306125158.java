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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getCovariance_1916306125158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199482;

    public SingularValueDecompositionImpl_getCovariance_1916306125158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199482 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term199298 = (double[]) newDoubleArray(1);
        Object term199594 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object[] term199307 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        setDoubleElement(term199298, 0, 4.6119733395616143E18);
        setField(term199482, term199482.getClass(), "singularValues", term199298);
        setField(term199482, term199482.getClass(), "cachedVt", null);
        setField(term199482, term199482.getClass(), "cachedV", null);
        setIntField(term199482, term199482.getClass(), "m", -2147483648);
        setIntField(term199482, term199482.getClass(), "n", -2147483648);
        setField(term199594, term199594.getClass(), "cachedV", null);
        setField(term199594, term199594.getClass(), "eigenvectors", term199307);
        setField(term199482, term199482.getClass(), "eigenDecomposition", term199594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.788271344618792E-308;
        callMethod(klass, "getCovariance", argTypes, term199482, args);
    }

};


