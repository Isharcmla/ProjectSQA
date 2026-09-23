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
import java.lang.NullPointerException;
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultidimensionalCounter_getCount_171046527346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11708;
     Object term11575;

    public MultidimensionalCounter_getCount_171046527346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11708 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        setIntField(term11708, term11708.getClass(), "dimension", 1);
        term11575 = (int[]) newIntArray(1);
        setIntElement(term11575, 0, -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term11575;
        try {
            callMethod(klass, "getCount", argTypes, term11708, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


