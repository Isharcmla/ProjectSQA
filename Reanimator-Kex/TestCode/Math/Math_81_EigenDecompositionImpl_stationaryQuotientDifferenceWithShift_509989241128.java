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
import java.lang.Double;

public class EigenDecompositionImpl_stationaryQuotientDifferenceWithShift_509989241128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46036;
     Object term45416;

    public EigenDecompositionImpl_stationaryQuotientDifferenceWithShift_509989241128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46036 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        term45416 = (double[]) newDoubleArray(490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term45416;
        args[1] = null;
        args[2] = Double.NaN;
        try {
            callMethod(klass, "stationaryQuotientDifferenceWithShift", argTypes, term46036, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


