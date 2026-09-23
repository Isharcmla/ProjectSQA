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

public class Fraction_add_7517755721687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844666;
     Object term844756;

    public Fraction_add_7517755721687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844666 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term844666, term844666.getClass(), "numerator", 1073741824);
        setIntField(term844666, term844666.getClass(), "denominator", -2147483630);
        term844756 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term844756, term844756.getClass(), "numerator", 1073741824);
        setIntField(term844756, term844756.getClass(), "denominator", -2147483631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term844756;
        try {
            callMethod(klass, "add", argTypes, term844666, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


