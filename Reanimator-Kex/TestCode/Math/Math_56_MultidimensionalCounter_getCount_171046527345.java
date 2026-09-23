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

public class MultidimensionalCounter_getCount_171046527345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10550;
     Object term9392;

    public MultidimensionalCounter_getCount_171046527345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10550 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term10393 = (int[]) newIntArray(25);
        setIntField(term10550, term10550.getClass(), "dimension", 998);
        setField(term10550, term10550.getClass(), "size", term10393);
        term9392 = (int[]) newIntArray(998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9392;
        try {
            callMethod(klass, "getCount", argTypes, term10550, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


