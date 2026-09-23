package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiply_75293955243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;
     Object term88;

    public Fraction_multiply_75293955243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term85, term85.getClass(), "denominator", 1876565163);
        setIntField(term85, term85.getClass(), "numerator", -817164822);
        term88 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term88, term88.getClass(), "denominator", -1016503459);
        setIntField(term88, term88.getClass(), "numerator", -1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term88;
        try {
            callMethod(klass, "multiply", argTypes, term85, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


