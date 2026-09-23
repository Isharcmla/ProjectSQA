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

public class Fraction_add_751775572278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114467;
     Object term114557;

    public Fraction_add_751775572278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114467 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term114467, term114467.getClass(), "numerator", 262144);
        setIntField(term114467, term114467.getClass(), "denominator", -2145373774);
        term114557 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term114557, term114557.getClass(), "numerator", 256);
        setIntField(term114557, term114557.getClass(), "denominator", -1725289087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term114557;
        try {
            callMethod(klass, "add", argTypes, term114467, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


