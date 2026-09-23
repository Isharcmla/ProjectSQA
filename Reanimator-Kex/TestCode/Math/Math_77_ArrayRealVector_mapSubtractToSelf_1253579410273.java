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

public class ArrayRealVector_mapSubtractToSelf_1253579410273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69003;
     Object term69011;
     Object term69007;

    public ArrayRealVector_mapSubtractToSelf_1253579410273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69003 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68892 = (double[]) newDoubleArray(1);
        setField(term69003, term69003.getClass(), "data", term68892);
        term69011 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term69012 = (double[]) newDoubleArray(1);
        setField(term69011, term69011.getClass(), "data", term69012);
        term69007 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term69008 = (double[]) newDoubleArray(1);
        setField(term69007, term69007.getClass(), "data", term69008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "mapSubtractToSelf", argTypes, term69003, args);
        assertTrue(recursiveEquals(term69003, term69011));
        assertTrue(recursiveEquals(retValue, term69007));
    }

};


