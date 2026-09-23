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

public class FastMath_copySign_721408451142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221;
     Object term223;

    public FastMath_copySign_721408451142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221 = new Float(0.8783184F);
        term223 = new Float(0.26413453F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.FastMath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term221;
        args[1] = term223;
        Object retValue = callMethod(klass, "copySign", argTypes, null, args);
        assertTrue(recursiveEquals(term221, 0.8783184F));
        assertTrue(recursiveEquals(term223, 0.26413453F));
        assertTrue(recursiveEquals(retValue, 0.8783184F));
    }

};


