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

public class ArrayRealVector_mapSinToSelf_912187191351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82612;
     Object term104815;
     Object term104812;

    public ArrayRealVector_mapSinToSelf_912187191351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82612 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term82501 = (double[]) newDoubleArray(1);
        setField(term82612, term82612.getClass(), "data", term82501);
        term104815 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term104816 = (double[]) newDoubleArray(1);
        setField(term104815, term104815.getClass(), "data", term104816);
        term104812 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term104813 = (double[]) newDoubleArray(1);
        setField(term104812, term104812.getClass(), "data", term104813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapSinToSelf", argTypes, term82612, args);
        assertTrue(recursiveEquals(term82612, term104815));
        assertTrue(recursiveEquals(retValue, term104812));
    }

};


