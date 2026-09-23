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

public class Fraction_subtract_2650031231080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346886;
     Object term346968;

    public Fraction_subtract_2650031231080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346886 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term346886, term346886.getClass(), "numerator", 268435456);
        setIntField(term346886, term346886.getClass(), "denominator", -54216);
        term346968 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term346968, term346968.getClass(), "numerator", -2147483648);
        setIntField(term346968, term346968.getClass(), "denominator", 39676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term346968;
        try {
            callMethod(klass, "subtract", argTypes, term346886, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


