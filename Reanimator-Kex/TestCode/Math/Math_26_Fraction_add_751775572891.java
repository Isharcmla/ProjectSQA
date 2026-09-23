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

public class Fraction_add_751775572891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432417;
     Object term432507;

    public Fraction_add_751775572891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432417 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term432417, term432417.getClass(), "numerator", 16384);
        setIntField(term432417, term432417.getClass(), "denominator", -2046819822);
        term432507 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term432507, term432507.getClass(), "numerator", 134217728);
        setIntField(term432507, term432507.getClass(), "denominator", -2131894303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term432507;
        try {
            callMethod(klass, "add", argTypes, term432417, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


