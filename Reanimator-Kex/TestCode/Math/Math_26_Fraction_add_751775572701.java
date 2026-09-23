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

public class Fraction_add_751775572701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328749;
     Object term328839;

    public Fraction_add_751775572701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328749 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term328749, term328749.getClass(), "numerator", 32768);
        setIntField(term328749, term328749.getClass(), "denominator", -12277758);
        term328839 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term328839, term328839.getClass(), "numerator", 4);
        setIntField(term328839, term328839.getClass(), "denominator", -1461763463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term328839;
        try {
            callMethod(klass, "add", argTypes, term328749, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


