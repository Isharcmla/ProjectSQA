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
import java.lang.Double;

public class FastMath_IEEEremainder_1816459113140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term215;

    public FastMath_IEEEremainder_1816459113140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = new Double(0.426231085465289);
        term215 = new Double(0.0027299293098262956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.FastMath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term213;
        args[1] = term215;
        Object retValue = callMethod(klass, "IEEEremainder", argTypes, null, args);
        assertTrue(recursiveEquals(term213, 0.426231085465289));
        assertTrue(recursiveEquals(term215, 0.0027299293098262956));
        assertTrue(recursiveEquals(retValue, 3.621131323868765E-4));
    }

};


