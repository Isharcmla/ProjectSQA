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

public class ArrayRealVector_hashCode_1799786272205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441;
     Object term20861;

    public ArrayRealVector_hashCode_1799786272205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term442 = (double[]) newDoubleArray(0);
        setField(term441, term441.getClass(), "data", term442);
        term20861 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term20862 = (double[]) newDoubleArray(0);
        setField(term20861, term20861.getClass(), "data", term20862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term441, args);
        assertTrue(recursiveEquals(term441, term20861));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


