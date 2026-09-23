package org.apache.commons.math3.util;

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
import org.apache.commons.math3.exception.NotPositiveException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MathArrays_checkNonNegative_44351926561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1639;

    public MathArrays_checkNonNegative_44351926561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1639 = (long[]) newLongArray(5);
        setLongElement(term1639, 0, 2486810210675247493L);
        setLongElement(term1639, 1, 7009926388951271268L);
        setLongElement(term1639, 2, -7672528020740371001L);
        setLongElement(term1639, 3, -4502405999831680926L);
        setLongElement(term1639, 4, 1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1639;
        try {
            callMethod(klass, "checkNonNegative", argTypes, null, args);
            assertTrue(false);
        }
        catch (NotPositiveException e) {
        }

    }

};


