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

public class ArrayRealVector_mapLog1pToSelf_1214128276233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29777;
     Object term36123;
     Object term36120;

    public ArrayRealVector_mapLog1pToSelf_1214128276233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29777 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term29666 = (double[]) newDoubleArray(1);
        setField(term29777, term29777.getClass(), "data", term29666);
        term36123 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term36124 = (double[]) newDoubleArray(1);
        setField(term36123, term36123.getClass(), "data", term36124);
        term36120 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term36121 = (double[]) newDoubleArray(1);
        setField(term36120, term36120.getClass(), "data", term36121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapLog1pToSelf", argTypes, term29777, args);
        assertTrue(recursiveEquals(term29777, term36123));
        assertTrue(recursiveEquals(retValue, term36120));
    }

};


