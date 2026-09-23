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

public class Fraction_addSub_6353799012221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655899;
     Object term655979;

    public Fraction_addSub_6353799012221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term655899 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term655899, term655899.getClass(), "numerator", 1073741824);
        setIntField(term655899, term655899.getClass(), "denominator", 536870913);
        term655979 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term655979, term655979.getClass(), "numerator", 1073741824);
        setIntField(term655979, term655979.getClass(), "denominator", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term655979;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term655899, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


