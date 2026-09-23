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

public class ArrayRealVector_toArray_2126409068198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424;
     Object term19793;
     Object term19790;

    public ArrayRealVector_toArray_2126409068198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term425 = (double[]) newDoubleArray(0);
        setField(term424, term424.getClass(), "data", term425);
        term19793 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term19794 = (double[]) newDoubleArray(0);
        setField(term19793, term19793.getClass(), "data", term19794);
        term19790 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toArray", argTypes, term424, args);
        assertTrue(recursiveEquals(term424, term19793));
        assertTrue(recursiveEquals(retValue, term19790));
    }

};


