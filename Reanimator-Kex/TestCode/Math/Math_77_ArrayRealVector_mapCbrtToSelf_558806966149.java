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

public class ArrayRealVector_mapCbrtToSelf_558806966149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;
     Object term7068;
     Object term7066;

    public ArrayRealVector_mapCbrtToSelf_558806966149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term209 = (double[]) newDoubleArray(0);
        setField(term208, term208.getClass(), "data", term209);
        term7068 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7069 = (double[]) newDoubleArray(0);
        setField(term7068, term7068.getClass(), "data", term7069);
        term7066 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7067 = (double[]) newDoubleArray(0);
        setField(term7066, term7066.getClass(), "data", term7067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapCbrtToSelf", argTypes, term208, args);
        assertTrue(recursiveEquals(term208, term7068));
        assertTrue(recursiveEquals(retValue, term7066));
    }

};


