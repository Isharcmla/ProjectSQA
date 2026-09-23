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

public class Fraction_subtract_265003123909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290214;
     Object term290296;

    public Fraction_subtract_265003123909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290214 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term290214, term290214.getClass(), "numerator", 524288);
        setIntField(term290214, term290214.getClass(), "denominator", -19137640);
        term290296 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term290296, term290296.getClass(), "numerator", -2147483648);
        setIntField(term290296, term290296.getClass(), "denominator", 13753900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term290296;
        try {
            callMethod(klass, "subtract", argTypes, term290214, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


