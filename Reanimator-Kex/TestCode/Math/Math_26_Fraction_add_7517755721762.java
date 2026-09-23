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

public class Fraction_add_7517755721762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884587;
     Object term884677;

    public Fraction_add_7517755721762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884587 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term884587, term884587.getClass(), "numerator", 512);
        setIntField(term884587, term884587.getClass(), "denominator", -2147482870);
        term884677 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term884677, term884677.getClass(), "numerator", 1);
        setIntField(term884677, term884677.getClass(), "denominator", -1612328023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term884677;
        try {
            callMethod(klass, "add", argTypes, term884587, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


