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

public class Fraction_add_751775572375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163821;
     Object term163911;

    public Fraction_add_751775572375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163821 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term163821, term163821.getClass(), "numerator", 262144);
        setIntField(term163821, term163821.getClass(), "denominator", -301826046);
        term163911 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term163911, term163911.getClass(), "numerator", 16777216);
        setIntField(term163911, term163911.getClass(), "denominator", -2009145783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term163911;
        try {
            callMethod(klass, "add", argTypes, term163821, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


