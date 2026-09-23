package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_2763527041347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439323;
     Object term439405;

    public Fraction_add_2763527041347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439323 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term439323, term439323.getClass(), "numerator", 16384);
        setIntField(term439323, term439323.getClass(), "denominator", 19247644);
        term439405 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term439405, term439405.getClass(), "numerator", 8);
        setIntField(term439405, term439405.getClass(), "denominator", -26478978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term439405;
        try {
            callMethod(klass, "add", argTypes, term439323, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


