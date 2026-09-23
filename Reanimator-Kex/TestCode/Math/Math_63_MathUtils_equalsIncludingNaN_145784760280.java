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
import java.lang.Double;

public class MathUtils_equalsIncludingNaN_145784760280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;
     Object term43;

    public MathUtils_equalsIncludingNaN_145784760280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = new Double(0.2641345529914265);
        term43 = new Double(0.36923381893433327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term41;
        args[1] = term43;
        Object retValue = callMethod(klass, "equalsIncludingNaN", argTypes, null, args);
        assertTrue(recursiveEquals(term41, 0.2641345529914265));
        assertTrue(recursiveEquals(term43, 0.36923381893433327));
        assertTrue(recursiveEquals(retValue, false));
    }

};


