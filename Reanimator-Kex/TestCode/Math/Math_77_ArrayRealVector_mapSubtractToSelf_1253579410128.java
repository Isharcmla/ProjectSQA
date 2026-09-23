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

public class ArrayRealVector_mapSubtractToSelf_1253579410128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;
     Object term160;
     Object term6960;
     Object term6957;

    public ArrayRealVector_mapSubtractToSelf_1253579410128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term159 = (double[]) newDoubleArray(0);
        setField(term158, term158.getClass(), "data", term159);
        term160 = new Double(0.6588948704887806);
        term6960 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6961 = (double[]) newDoubleArray(0);
        setField(term6960, term6960.getClass(), "data", term6961);
        term6957 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6958 = (double[]) newDoubleArray(0);
        setField(term6957, term6957.getClass(), "data", term6958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term160;
        Object retValue = callMethod(klass, "mapSubtractToSelf", argTypes, term158, args);
        assertTrue(recursiveEquals(term158, term6960));
        assertTrue(recursiveEquals(term160, 0.6588948704887806));
        assertTrue(recursiveEquals(retValue, term6957));
    }

};


