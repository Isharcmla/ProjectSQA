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

public class MultidimensionalCounter_toString_59240788915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;
     Object term2343;

    public MultidimensionalCounter_toString_59240788915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term157 = (int[]) newIntArray(3);
        int[] term161 = (int[]) newIntArray(1);
        setIntField(term155, term155.getClass(), "dimension", -2027534003);
        setIntElement(term157, 0, 1063420942);
        setIntElement(term157, 1, 1375330971);
        setIntElement(term157, 2, -478195677);
        setField(term155, term155.getClass(), "uniCounterOffset", term157);
        setIntElement(term161, 0, 972867650);
        setField(term155, term155.getClass(), "size", term161);
        setIntField(term155, term155.getClass(), "totalSize", 1655935355);
        setIntField(term155, term155.getClass(), "last", -481533957);
        term2343 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term2344 = (int[]) newIntArray(3);
        int[] term2345 = (int[]) newIntArray(1);
        setIntField(term2343, term2343.getClass(), "dimension", -2027534003);
        setIntElement(term2344, 0, 1063420942);
        setIntElement(term2344, 1, 1375330971);
        setIntElement(term2344, 2, -478195677);
        setField(term2343, term2343.getClass(), "uniCounterOffset", term2344);
        setIntElement(term2345, 0, 972867650);
        setField(term2343, term2343.getClass(), "size", term2345);
        setIntField(term2343, term2343.getClass(), "totalSize", 1655935355);
        setIntField(term2343, term2343.getClass(), "last", -481533957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term155, args);
        assertTrue(recursiveEquals(term155, term2343));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


