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

public class Fraction_add_751775572882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426827;
     Object term426917;

    public Fraction_add_751775572882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426827 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term426827, term426827.getClass(), "numerator", 1048576);
        setIntField(term426827, term426827.getClass(), "denominator", -269337726);
        term426917 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term426917, term426917.getClass(), "numerator", -2147483648);
        setIntField(term426917, term426917.getClass(), "denominator", -2145800903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term426917;
        try {
            callMethod(klass, "add", argTypes, term426827, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


