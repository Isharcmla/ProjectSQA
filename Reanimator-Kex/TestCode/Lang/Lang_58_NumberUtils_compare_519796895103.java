package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;
import java.lang.Float;

public class NumberUtils_compare_519796895103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term693;

    public NumberUtils_compare_519796895103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691 = new Float(0.8474802F);
        term693 = new Float(0.9985961F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term691;
        args[1] = term693;
        Object retValue = callMethod(klass, "compare", argTypes, null, args);
        assertTrue(recursiveEquals(term691, 0.8474802F));
        assertTrue(recursiveEquals(term693, 0.9985961F));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


