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

public class Fraction_addSub_635379901185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42636;
     Object term42716;

    public Fraction_addSub_635379901185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42636 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term42636, term42636.getClass(), "numerator", -2147483648);
        setIntField(term42636, term42636.getClass(), "denominator", -2147483648);
        term42716 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term42716, term42716.getClass(), "numerator", -2147483648);
        setIntField(term42716, term42716.getClass(), "denominator", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term42716;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term42636, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


