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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;
import java.lang.Float;
import java.lang.Double;

public class FastMath_nextAfter_701393537125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term165;

    public FastMath_nextAfter_701393537125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = new Float(0.8564069F);
        term165 = new Double(0.025133051616627267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.FastMath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term163;
        args[1] = term165;
        Object retValue = callMethod(klass, "nextAfter", argTypes, null, args);
        assertTrue(recursiveEquals(term163, 0.8564069F));
        assertTrue(recursiveEquals(term165, 0.025133051616627267));
        assertTrue(recursiveEquals(retValue, 0.85640687F));
    }

};


