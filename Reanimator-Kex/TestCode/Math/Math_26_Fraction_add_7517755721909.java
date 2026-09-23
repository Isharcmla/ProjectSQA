package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_7517755721909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955966;
     Object term956056;

    public Fraction_add_7517755721909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term955966 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term955966, term955966.getClass(), "numerator", 8192);
        setIntField(term955966, term955966.getClass(), "denominator", -604831230);
        term956056 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term956056, term956056.getClass(), "numerator", 256);
        setIntField(term956056, term956056.getClass(), "denominator", -2048699975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term956056;
        try {
            callMethod(klass, "add", argTypes, term955966, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


