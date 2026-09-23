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

public class Fraction_subtract_2650031231307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424321;
     Object term424403;

    public Fraction_subtract_2650031231307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424321 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term424321, term424321.getClass(), "numerator", 512);
        setIntField(term424321, term424321.getClass(), "denominator", -1882345544);
        term424403 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term424403, term424403.getClass(), "numerator", 4194304);
        setIntField(term424403, term424403.getClass(), "denominator", 1008670396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term424403;
        try {
            callMethod(klass, "subtract", argTypes, term424321, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


