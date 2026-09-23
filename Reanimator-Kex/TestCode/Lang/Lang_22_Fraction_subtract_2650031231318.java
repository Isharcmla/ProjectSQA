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

public class Fraction_subtract_2650031231318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428046;
     Object term428128;

    public Fraction_subtract_2650031231318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428046 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term428046, term428046.getClass(), "numerator", 1024);
        setIntField(term428046, term428046.getClass(), "denominator", -1602355208);
        term428128 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term428128, term428128.getClass(), "numerator", 4);
        setIntField(term428128, term428128.getClass(), "denominator", 1326907356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term428128;
        try {
            callMethod(klass, "subtract", argTypes, term428046, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


