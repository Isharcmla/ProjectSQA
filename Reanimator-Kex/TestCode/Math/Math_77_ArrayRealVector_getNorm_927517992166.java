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

public class ArrayRealVector_getNorm_927517992166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;
     Object term10810;

    public ArrayRealVector_getNorm_927517992166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term276 = (double[]) newDoubleArray(0);
        setField(term275, term275.getClass(), "data", term276);
        term10810 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term10811 = (double[]) newDoubleArray(0);
        setField(term10810, term10810.getClass(), "data", term10811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNorm", argTypes, term275, args);
        assertTrue(recursiveEquals(term275, term10810));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


