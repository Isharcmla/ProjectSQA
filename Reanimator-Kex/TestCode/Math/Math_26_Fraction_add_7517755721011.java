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

public class Fraction_add_7517755721011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493892;
     Object term493982;

    public Fraction_add_7517755721011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493892 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term493892, term493892.getClass(), "numerator", 16384);
        setIntField(term493892, term493892.getClass(), "denominator", -2075129854);
        term493982 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term493982, term493982.getClass(), "numerator", 1073741824);
        setIntField(term493982, term493982.getClass(), "denominator", -1349524763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term493982;
        try {
            callMethod(klass, "add", argTypes, term493892, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


