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
import java.lang.Object;
import java.lang.Double;

public class ArrayRealVector_init_23078568109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40;
     Object term2069;
     Object term2071;

    public ArrayRealVector_init_23078568109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term41 = new Double(0.13238746331190498);
        Double term43 = new Double(0.3455959125047594);
        Double term45 = new Double(0.5523635872663106);
        Double term47 = new Double(0.544608645520025);
        term40 = (Object[]) newArray("java.lang.Double", 4);
        setElement(term40, 0, term41);
        setElement(term40, 1, term43);
        setElement(term40, 2, term45);
        setElement(term40, 3, term47);
        term2069 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2070 = (double[]) newDoubleArray(4);
        setDoubleElement(term2070, 0, 0.13238746331190498);
        setDoubleElement(term2070, 1, 0.3455959125047594);
        setDoubleElement(term2070, 2, 0.5523635872663106);
        setDoubleElement(term2070, 3, 0.544608645520025);
        setField(term2069, term2069.getClass(), "data", term2070);
        Double term2072 = new Double(0.13238746331190498);
        Double term2073 = new Double(0.3455959125047594);
        Double term2074 = new Double(0.5523635872663106);
        Double term2075 = new Double(0.544608645520025);
        term2071 = (Object[]) newArray("java.lang.Double", 4);
        setElement(term2071, 0, term2072);
        setElement(term2071, 1, term2073);
        setElement(term2071, 2, term2074);
        setElement(term2071, 3, term2075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term40;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2069));
        assertTrue(recursiveEquals(term40, term2071));
    }

};


