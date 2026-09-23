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

public class Fraction_add_7517755722153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1070498;
     Object term1070588;

    public Fraction_add_7517755722153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1070498 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1070498, term1070498.getClass(), "numerator", -2147483648);
        setIntField(term1070498, term1070498.getClass(), "denominator", -509870030);
        term1070588 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1070588, term1070588.getClass(), "numerator", 1048576);
        setIntField(term1070588, term1070588.getClass(), "denominator", -1518399519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1070588;
        try {
            callMethod(klass, "add", argTypes, term1070498, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


