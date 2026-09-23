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

public class Fraction_subtract_265003123928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296806;
     Object term296888;

    public Fraction_subtract_265003123928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296806 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term296806, term296806.getClass(), "numerator", 16384);
        setIntField(term296806, term296806.getClass(), "denominator", -1632335528);
        term296888 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term296888, term296888.getClass(), "numerator", 32);
        setIntField(term296888, term296888.getClass(), "denominator", 1071266316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term296888;
        try {
            callMethod(klass, "subtract", argTypes, term296806, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


