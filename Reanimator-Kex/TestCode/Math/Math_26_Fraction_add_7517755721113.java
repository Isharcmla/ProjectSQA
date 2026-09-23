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

public class Fraction_add_7517755721113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545959;
     Object term546049;

    public Fraction_add_7517755721113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545959 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term545959, term545959.getClass(), "numerator", 512);
        setIntField(term545959, term545959.getClass(), "denominator", -1681905662);
        term546049 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term546049, term546049.getClass(), "numerator", 128);
        setIntField(term546049, term546049.getClass(), "denominator", -2144468103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term546049;
        try {
            callMethod(klass, "add", argTypes, term545959, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


