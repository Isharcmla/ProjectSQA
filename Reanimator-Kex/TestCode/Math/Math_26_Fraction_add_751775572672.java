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

public class Fraction_add_751775572672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312774;
     Object term312864;

    public Fraction_add_751775572672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312774 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term312774, term312774.getClass(), "numerator", -2147483648);
        setIntField(term312774, term312774.getClass(), "denominator", -1843647486);
        term312864 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term312864, term312864.getClass(), "numerator", -2147483648);
        setIntField(term312864, term312864.getClass(), "denominator", -1213030423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term312864;
        try {
            callMethod(klass, "add", argTypes, term312774, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


