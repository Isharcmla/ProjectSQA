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

public class FastMath_abs_1060180963118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;

    public FastMath_abs_1060180963118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = new Float(0.3455959F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.FastMath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term143;
        Object retValue = callMethod(klass, "abs", argTypes, null, args);
        assertTrue(recursiveEquals(term143, 0.3455959F));
        assertTrue(recursiveEquals(retValue, 0.3455959F));
    }

};


