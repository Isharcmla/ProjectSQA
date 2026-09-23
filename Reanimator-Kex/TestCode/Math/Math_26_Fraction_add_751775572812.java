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

public class Fraction_add_751775572812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393300;
     Object term393390;

    public Fraction_add_751775572812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393300 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term393300, term393300.getClass(), "numerator", -2147483648);
        setIntField(term393300, term393300.getClass(), "denominator", -1276632294);
        term393390 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term393390, term393390.getClass(), "numerator", -2147483648);
        setIntField(term393390, term393390.getClass(), "denominator", -2095934127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term393390;
        try {
            callMethod(klass, "add", argTypes, term393300, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


