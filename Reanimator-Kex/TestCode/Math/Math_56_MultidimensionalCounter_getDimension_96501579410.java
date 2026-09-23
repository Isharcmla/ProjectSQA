package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;

public class MultidimensionalCounter_getDimension_96501579410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;
     Object term1137;

    public MultidimensionalCounter_getDimension_96501579410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term34 = (int[]) newIntArray(4);
        int[] term39 = (int[]) newIntArray(1);
        setIntField(term32, term32.getClass(), "dimension", 597278769);
        setIntElement(term34, 0, -1685132342);
        setIntElement(term34, 1, -1456670397);
        setIntElement(term34, 2, 1622346318);
        setIntElement(term34, 3, 1048535127);
        setField(term32, term32.getClass(), "uniCounterOffset", term34);
        setIntElement(term39, 0, -655067527);
        setField(term32, term32.getClass(), "size", term39);
        setIntField(term32, term32.getClass(), "totalSize", -6029667);
        setIntField(term32, term32.getClass(), "last", -2068769794);
        term1137 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term1140 = (int[]) newIntArray(4);
        int[] term1142 = (int[]) newIntArray(1);
        setIntField(term1137, term1137.getClass(), "dimension", 597278769);
        setIntElement(term1140, 0, -1685132342);
        setIntElement(term1140, 1, -1456670397);
        setIntElement(term1140, 2, 1622346318);
        setIntElement(term1140, 3, 1048535127);
        setField(term1137, term1137.getClass(), "uniCounterOffset", term1140);
        setIntElement(term1142, 0, -655067527);
        setField(term1137, term1137.getClass(), "size", term1142);
        setIntField(term1137, term1137.getClass(), "totalSize", -6029667);
        setIntField(term1137, term1137.getClass(), "last", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDimension", argTypes, term32, args);
        assertTrue(recursiveEquals(term32, term1137));
        assertTrue(recursiveEquals(retValue, 597278769));
    }

};


