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

public class Fraction_add_7517755721332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663385;
     Object term663475;

    public Fraction_add_7517755721332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term663385 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term663385, term663385.getClass(), "numerator", 2);
        setIntField(term663385, term663385.getClass(), "denominator", -58228238);
        term663475 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term663475, term663475.getClass(), "numerator", 67108864);
        setIntField(term663475, term663475.getClass(), "denominator", -2114049007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term663475;
        try {
            callMethod(klass, "add", argTypes, term663385, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


