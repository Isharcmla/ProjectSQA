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

public class ArrayRealVector_mapSinhToSelf_1481537287348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82229;
     Object term104546;
     Object term104543;

    public ArrayRealVector_mapSinhToSelf_1481537287348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82229 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term82118 = (double[]) newDoubleArray(1);
        setField(term82229, term82229.getClass(), "data", term82118);
        term104546 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term104547 = (double[]) newDoubleArray(1);
        setField(term104546, term104546.getClass(), "data", term104547);
        term104543 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term104544 = (double[]) newDoubleArray(1);
        setField(term104543, term104543.getClass(), "data", term104544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapSinhToSelf", argTypes, term82229, args);
        assertTrue(recursiveEquals(term82229, term104546));
        assertTrue(recursiveEquals(retValue, term104543));
    }

};


