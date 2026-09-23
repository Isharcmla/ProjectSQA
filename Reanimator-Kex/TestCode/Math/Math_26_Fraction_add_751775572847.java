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

public class Fraction_add_751775572847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413778;
     Object term413868;

    public Fraction_add_751775572847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413778 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term413778, term413778.getClass(), "numerator", 134217728);
        setIntField(term413778, term413778.getClass(), "denominator", -1954414382);
        term413868 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term413868, term413868.getClass(), "numerator", 262144);
        setIntField(term413868, term413868.getClass(), "denominator", -1342377023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term413868;
        try {
            callMethod(klass, "add", argTypes, term413778, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


