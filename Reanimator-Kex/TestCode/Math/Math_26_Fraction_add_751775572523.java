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

public class Fraction_add_751775572523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239380;
     Object term239470;

    public Fraction_add_751775572523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239380 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term239380, term239380.getClass(), "numerator", 4194304);
        setIntField(term239380, term239380.getClass(), "denominator", -130506638);
        term239470 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term239470, term239470.getClass(), "numerator", 16384);
        setIntField(term239470, term239470.getClass(), "denominator", -2107173263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term239470;
        try {
            callMethod(klass, "add", argTypes, term239380, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


