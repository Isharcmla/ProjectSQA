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
import org.apache.commons.math.exception.OutOfRangeException;
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultidimensionalCounter_getCount_171046527364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32710;
     Object term32547;

    public MultidimensionalCounter_getCount_171046527364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32710 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term32563 = (int[]) newIntArray(8);
        setIntField(term32710, term32710.getClass(), "dimension", 8);
        setIntElement(term32563, 0, -1);
        setIntElement(term32563, 1, -1);
        setIntElement(term32563, 2, -1);
        setIntElement(term32563, 3, -1);
        setIntElement(term32563, 4, -1);
        setIntElement(term32563, 5, -1);
        setIntElement(term32563, 6, -1);
        setIntElement(term32563, 7, -1);
        setField(term32710, term32710.getClass(), "size", term32563);
        term32547 = (int[]) newIntArray(8);
        setIntElement(term32547, 0, -1);
        setIntElement(term32547, 1, -1);
        setIntElement(term32547, 2, -1);
        setIntElement(term32547, 3, -1);
        setIntElement(term32547, 4, -1);
        setIntElement(term32547, 5, -1);
        setIntElement(term32547, 6, -1);
        setIntElement(term32547, 7, -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term32547;
        try {
            callMethod(klass, "getCount", argTypes, term32710, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


