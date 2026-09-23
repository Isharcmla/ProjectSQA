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

public class Fraction_add_751775572773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369839;
     Object term369929;

    public Fraction_add_751775572773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369839 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term369839, term369839.getClass(), "numerator", 268435456);
        setIntField(term369839, term369839.getClass(), "denominator", -402595790);
        term369929 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term369929, term369929.getClass(), "numerator", 268435456);
        setIntField(term369929, term369929.getClass(), "denominator", -2085097823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term369929;
        try {
            callMethod(klass, "add", argTypes, term369839, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


