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

public class Fraction_subtract_740425991397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159852;
     Object term159942;

    public Fraction_subtract_740425991397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159852 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term159852, term159852.getClass(), "numerator", 1073741824);
        setIntField(term159852, term159852.getClass(), "denominator", 1);
        term159942 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term159942, term159942.getClass(), "numerator", 1073741824);
        setIntField(term159942, term159942.getClass(), "denominator", -134344700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term159942;
        try {
            callMethod(klass, "subtract", argTypes, term159852, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


