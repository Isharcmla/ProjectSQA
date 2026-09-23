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
import java.lang.Float;

public class FastMath_min_469788378130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;
     Object term314;

    public FastMath_min_469788378130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312 = new Float(0.3455959F);
        term314 = new Float(0.09123778F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.FastMath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term312;
        args[1] = term314;
        Object retValue = callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term312, 0.3455959F));
        assertTrue(recursiveEquals(term314, 0.09123778F));
        assertTrue(recursiveEquals(retValue, 0.09123778F));
    }

};


