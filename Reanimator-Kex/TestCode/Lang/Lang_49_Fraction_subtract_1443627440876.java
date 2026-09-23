package org.apache.commons.lang.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_1443627440876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248629;
     Object term248709;

    public Fraction_subtract_1443627440876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248629 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term248629, term248629.getClass(), "numerator", 1);
        setIntField(term248629, term248629.getClass(), "denominator", -752189432);
        term248709 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term248709, term248709.getClass(), "numerator", 67108864);
        setIntField(term248709, term248709.getClass(), "denominator", 1128284164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term248709;
        try {
            callMethod(klass, "subtract", argTypes, term248629, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


