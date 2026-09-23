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

public class Fraction_add_751775572801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327145;
     Object term327235;

    public Fraction_add_751775572801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327145 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term327145, term327145.getClass(), "numerator", 32);
        setIntField(term327145, term327145.getClass(), "denominator", -2138990478);
        term327235 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term327235, term327235.getClass(), "numerator", 536870912);
        setIntField(term327235, term327235.getClass(), "denominator", -1610718191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term327235;
        try {
            callMethod(klass, "add", argTypes, term327145, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


