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

public class Fraction_add_7517755721603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669730;
     Object term669820;

    public Fraction_add_7517755721603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669730 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term669730, term669730.getClass(), "numerator", -2147483648);
        setIntField(term669730, term669730.getClass(), "denominator", -2146930430);
        term669820 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term669820, term669820.getClass(), "numerator", 8);
        setIntField(term669820, term669820.getClass(), "denominator", -1125646551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term669820;
        try {
            callMethod(klass, "add", argTypes, term669730, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


