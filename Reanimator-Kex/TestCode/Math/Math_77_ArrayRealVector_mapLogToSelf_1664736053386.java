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
import java.lang.Double;

public class ArrayRealVector_mapLogToSelf_1664736053386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127058;
     Object term127179;
     Object term127176;

    public ArrayRealVector_mapLogToSelf_1664736053386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127058 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term126947 = (double[]) newDoubleArray(1);
        setField(term127058, term127058.getClass(), "data", term126947);
        term127179 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term127180 = (double[]) newDoubleArray(1);
        setDoubleElement(term127180, 0, Double.NEGATIVE_INFINITY);
        setField(term127179, term127179.getClass(), "data", term127180);
        term127176 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term127177 = (double[]) newDoubleArray(1);
        setDoubleElement(term127177, 0, Double.NEGATIVE_INFINITY);
        setField(term127176, term127176.getClass(), "data", term127177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapLogToSelf", argTypes, term127058, args);
        assertTrue(recursiveEquals(term127058, term127179));
        assertTrue(recursiveEquals(retValue, term127176));
    }

};


