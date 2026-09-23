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

public class Fraction_subtract_2650031231983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647521;
     Object term647603;

    public Fraction_subtract_2650031231983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647521 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term647521, term647521.getClass(), "numerator", 2097152);
        setIntField(term647521, term647521.getClass(), "denominator", -1078721224);
        term647603 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term647603, term647603.getClass(), "numerator", -2147483648);
        setIntField(term647603, term647603.getClass(), "denominator", 542113916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term647603;
        try {
            callMethod(klass, "subtract", argTypes, term647521, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


