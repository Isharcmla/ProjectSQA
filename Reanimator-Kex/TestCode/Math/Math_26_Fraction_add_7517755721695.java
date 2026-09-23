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

public class Fraction_add_7517755721695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849202;
     Object term849292;

    public Fraction_add_7517755721695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term849202 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term849202, term849202.getClass(), "numerator", 1073741824);
        setIntField(term849202, term849202.getClass(), "denominator", -786734);
        term849292 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term849292, term849292.getClass(), "numerator", 268435456);
        setIntField(term849292, term849292.getClass(), "denominator", -1401919231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term849292;
        try {
            callMethod(klass, "add", argTypes, term849202, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


