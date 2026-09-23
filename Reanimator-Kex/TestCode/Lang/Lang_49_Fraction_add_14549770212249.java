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

public class Fraction_add_14549770212249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665538;
     Object term665618;

    public Fraction_add_14549770212249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665538 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term665538, term665538.getClass(), "numerator", -2147483648);
        setIntField(term665538, term665538.getClass(), "denominator", 1412570996);
        term665618 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term665618, term665618.getClass(), "numerator", 67108864);
        setIntField(term665618, term665618.getClass(), "denominator", -1579621494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term665618;
        try {
            callMethod(klass, "add", argTypes, term665538, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


