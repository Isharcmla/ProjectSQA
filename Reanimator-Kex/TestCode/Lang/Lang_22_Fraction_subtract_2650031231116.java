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

public class Fraction_subtract_2650031231116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358230;
     Object term358312;

    public Fraction_subtract_2650031231116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358230 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term358230, term358230.getClass(), "numerator", 262144);
        setIntField(term358230, term358230.getClass(), "denominator", -1073741832);
        term358312 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term358312, term358312.getClass(), "numerator", -2147483648);
        setIntField(term358312, term358312.getClass(), "denominator", 872415196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term358312;
        try {
            callMethod(klass, "subtract", argTypes, term358230, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


