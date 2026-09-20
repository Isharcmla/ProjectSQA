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

public class Fraction_multiply_192420456785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20545;
     Object term20635;

    public Fraction_multiply_192420456785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20545 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term20545, term20545.getClass(), "numerator", -1605304022);
        setIntField(term20545, term20545.getClass(), "denominator", 640);
        term20635 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term20635, term20635.getClass(), "numerator", -335544335);
        setIntField(term20635, term20635.getClass(), "denominator", 2010748679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term20635;
        try {
            callMethod(klass, "multiply", argTypes, term20545, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};
