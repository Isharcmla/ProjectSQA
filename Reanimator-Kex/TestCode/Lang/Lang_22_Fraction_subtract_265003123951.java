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

public class Fraction_subtract_265003123951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304307;
     Object term304389;

    public Fraction_subtract_265003123951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304307 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term304307, term304307.getClass(), "numerator", 4096);
        setIntField(term304307, term304307.getClass(), "denominator", -658312);
        term304389 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term304389, term304389.getClass(), "numerator", 1073741824);
        setIntField(term304389, term304389.getClass(), "denominator", 475420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term304389;
        try {
            callMethod(klass, "subtract", argTypes, term304307, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


