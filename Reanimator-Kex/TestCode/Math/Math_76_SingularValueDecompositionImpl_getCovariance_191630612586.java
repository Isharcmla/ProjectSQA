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

public class SingularValueDecompositionImpl_getCovariance_191630612586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38295;

    public SingularValueDecompositionImpl_getCovariance_191630612586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38295 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term38091 = (double[]) newDoubleArray(3);
        Object term38407 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleElement(term38091, 0, 4.503599627370498E15);
        setDoubleElement(term38091, 1, 1.0);
        setDoubleElement(term38091, 2, 1.0);
        setField(term38295, term38295.getClass(), "singularValues", term38091);
        setField(term38295, term38295.getClass(), "cachedVt", null);
        setField(term38295, term38295.getClass(), "cachedV", null);
        setIntField(term38295, term38295.getClass(), "m", -2147483648);
        setIntField(term38295, term38295.getClass(), "n", -2147483648);
        setField(term38295, term38295.getClass(), "eigenDecomposition", term38407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 4.9E-324;
        try {
            callMethod(klass, "getCovariance", argTypes, term38295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


