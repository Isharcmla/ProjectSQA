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

public class SingularValueDecompositionImpl_getCovariance_191630612566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24911;

    public SingularValueDecompositionImpl_getCovariance_191630612566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24911 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term24646 = (double[]) newDoubleArray(6);
        Object term25023 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleElement(term24646, 0, 9.00782098481152E15);
        setDoubleElement(term24646, 1, 9.007542856318978E15);
        setDoubleElement(term24646, 2, 7.4629251073E10);
        setDoubleElement(term24646, 3, 4.505836235784448E15);
        setDoubleElement(term24646, 4, 9.007273883992068E15);
        setDoubleElement(term24646, 5, 4.503599627370496E15);
        setField(term24911, term24911.getClass(), "singularValues", term24646);
        setField(term24911, term24911.getClass(), "cachedVt", null);
        setField(term24911, term24911.getClass(), "cachedV", null);
        setIntField(term24911, term24911.getClass(), "m", -2147483648);
        setIntField(term24911, term24911.getClass(), "n", -2147483648);
        setField(term24911, term24911.getClass(), "eigenDecomposition", term25023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 3.687174913E-313;
        try {
            callMethod(klass, "getCovariance", argTypes, term24911, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


