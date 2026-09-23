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

public class ArrayRealVector_mapPowToSelf_1762367546131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;
     Object term172;
     Object term6978;
     Object term6975;

    public ArrayRealVector_mapPowToSelf_1762367546131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term171 = (double[]) newDoubleArray(0);
        setField(term170, term170.getClass(), "data", term171);
        term172 = new Double(0.5873228247510078);
        term6978 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6979 = (double[]) newDoubleArray(0);
        setField(term6978, term6978.getClass(), "data", term6979);
        term6975 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6976 = (double[]) newDoubleArray(0);
        setField(term6975, term6975.getClass(), "data", term6976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term172;
        Object retValue = callMethod(klass, "mapPowToSelf", argTypes, term170, args);
        assertTrue(recursiveEquals(term170, term6978));
        assertTrue(recursiveEquals(term172, 0.5873228247510078));
        assertTrue(recursiveEquals(retValue, term6975));
    }

};


