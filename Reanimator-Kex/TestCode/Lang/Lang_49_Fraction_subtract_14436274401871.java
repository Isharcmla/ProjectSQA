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

public class Fraction_subtract_14436274401871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548606;
     Object term548686;

    public Fraction_subtract_14436274401871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548606 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term548606, term548606.getClass(), "numerator", 268435456);
        setIntField(term548606, term548606.getClass(), "denominator", -1147162728);
        term548686 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term548686, term548686.getClass(), "numerator", 1073741824);
        setIntField(term548686, term548686.getClass(), "denominator", 1337958188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term548686;
        try {
            callMethod(klass, "subtract", argTypes, term548606, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


