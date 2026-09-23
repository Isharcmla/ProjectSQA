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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ArrayRealVector_getSubVector_1302028781192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;
     Object term391;
     Object term393;

    public ArrayRealVector_getSubVector_1302028781192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term390 = (double[]) newDoubleArray(0);
        setField(term389, term389.getClass(), "data", term390);
        term391 = new Integer(-2038273078);
        term393 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term391;
        args[1] = term393;
        try {
            callMethod(klass, "getSubVector", argTypes, term389, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


