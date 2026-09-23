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

public class ArrayRealVector_subtract_1937547621364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88416;
     Object term88514;
     Object term120011;
     Object term120013;
     Object term119991;

    public ArrayRealVector_subtract_1937547621364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88416 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term88236 = (double[]) newDoubleArray(8);
        setField(term88416, term88416.getClass(), "data", term88236);
        term88514 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term88514, term88514.getClass(), "data", term88236);
        term120011 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term120012 = (double[]) newDoubleArray(8);
        setField(term120011, term120011.getClass(), "data", term120012);
        term120013 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term120014 = (double[]) newDoubleArray(8);
        setField(term120013, term120013.getClass(), "data", term120014);
        term119991 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term119992 = (double[]) newDoubleArray(8);
        setField(term119991, term119991.getClass(), "data", term119992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term88514;
        Object retValue = callMethod(klass, "subtract", argTypes, term88416, args);
        assertTrue(recursiveEquals(term88416, term120011));
        assertTrue(recursiveEquals(term88514, term120013));
        assertTrue(recursiveEquals(retValue, term119991));
    }

};


