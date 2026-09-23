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

public class NumberUtils_max_150342944101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;
     Object term683;
     Object term685;

    public NumberUtils_max_150342944101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681 = new Float(0.6608425F);
        term683 = new Float(0.37773192F);
        term685 = new Float(0.24413109F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term681;
        args[1] = term683;
        args[2] = term685;
        Object retValue = callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term681, 0.6608425F));
        assertTrue(recursiveEquals(term683, 0.37773192F));
        assertTrue(recursiveEquals(term685, 0.24413109F));
        assertTrue(recursiveEquals(retValue, 0.6608425F));
    }

};


