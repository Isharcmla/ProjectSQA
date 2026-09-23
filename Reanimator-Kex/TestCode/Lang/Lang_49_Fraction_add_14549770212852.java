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

public class Fraction_add_14549770212852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term853991;
     Object term854071;

    public Fraction_add_14549770212852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term853991 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term853991, term853991.getClass(), "numerator", 1073741824);
        setIntField(term853991, term853991.getClass(), "denominator", 1644445660);
        term854071 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term854071, term854071.getClass(), "numerator", -2147483648);
        setIntField(term854071, term854071.getClass(), "denominator", -2114069410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term854071;
        try {
            callMethod(klass, "add", argTypes, term853991, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


