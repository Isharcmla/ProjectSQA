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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_addSub_635379901105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17127;
     Object term17207;

    public Fraction_addSub_635379901105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17127 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term17127, term17127.getClass(), "numerator", 268435456);
        setIntField(term17127, term17127.getClass(), "denominator", 1073741825);
        term17207 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term17207, term17207.getClass(), "numerator", 32);
        setIntField(term17207, term17207.getClass(), "denominator", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term17207;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term17127, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


