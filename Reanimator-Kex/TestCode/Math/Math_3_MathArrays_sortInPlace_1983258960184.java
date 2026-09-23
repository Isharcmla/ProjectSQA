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
import org.apache.commons.math3.exception.NullArgumentException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MathArrays_sortInPlace_1983258960184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public MathArrays_sortInPlace_1983258960184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math3.util.MathArrays$OrderDirection");
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "sortInPlace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullArgumentException e) {
        }

    }

};


