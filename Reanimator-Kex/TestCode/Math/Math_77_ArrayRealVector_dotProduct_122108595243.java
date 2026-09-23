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

public class ArrayRealVector_dotProduct_122108595243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36363;
     Object term36252;
     Object term46278;
     Object term46280;

    public ArrayRealVector_dotProduct_122108595243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36363 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        term36252 = (double[]) newDoubleArray(0);
        setField(term36363, term36363.getClass(), "data", term36252);
        term46278 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term46279 = (double[]) newDoubleArray(0);
        setField(term46278, term46278.getClass(), "data", term46279);
        term46280 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term36252;
        Object retValue = callMethod(klass, "dotProduct", argTypes, term36363, args);
        assertTrue(recursiveEquals(term36363, term46278));
        assertTrue(recursiveEquals(term36252, term46280));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


