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

public class Fraction_add_7517755721319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543052;
     Object term543142;

    public Fraction_add_7517755721319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543052 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term543052, term543052.getClass(), "numerator", 8388608);
        setIntField(term543052, term543052.getClass(), "denominator", -1873146366);
        term543142 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term543142, term543142.getClass(), "numerator", 64);
        setIntField(term543142, term543142.getClass(), "denominator", -1113457287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term543142;
        try {
            callMethod(klass, "add", argTypes, term543052, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


