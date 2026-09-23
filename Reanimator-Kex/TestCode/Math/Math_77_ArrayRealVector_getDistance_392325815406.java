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
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_getDistance_392325815406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131193;
     Object term131291;
     Object term144931;
     Object term144933;

    public ArrayRealVector_getDistance_392325815406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131193 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term129607 = (double[]) newDoubleArray(489);
        setField(term131193, term131193.getClass(), "data", term129607);
        term131291 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term131291, term131291.getClass(), "data", term129607);
        term144931 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term144932 = (double[]) newDoubleArray(489);
        setField(term144931, term144931.getClass(), "data", term144932);
        term144933 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term144934 = (double[]) newDoubleArray(489);
        setField(term144933, term144933.getClass(), "data", term144934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term131291;
        Object retValue = callMethod(klass, "getDistance", argTypes, term131193, args);
        assertTrue(recursiveEquals(term131193, term144931));
        assertTrue(recursiveEquals(term131291, term144933));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


