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

public class Fraction_subtract_2650031231737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564156;
     Object term564238;

    public Fraction_subtract_2650031231737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term564156 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term564156, term564156.getClass(), "numerator", 1073741824);
        setIntField(term564156, term564156.getClass(), "denominator", -558778120);
        term564238 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term564238, term564238.getClass(), "numerator", 1073741824);
        setIntField(term564238, term564238.getClass(), "denominator", 465629276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term564238;
        try {
            callMethod(klass, "subtract", argTypes, term564156, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


