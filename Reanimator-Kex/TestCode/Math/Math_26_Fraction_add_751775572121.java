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

public class Fraction_add_751775572121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36078;
     Object term36168;

    public Fraction_add_751775572121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36078 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term36078, term36078.getClass(), "numerator", 8192);
        setIntField(term36078, term36078.getClass(), "denominator", -1073676270);
        term36168 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term36168, term36168.getClass(), "numerator", 16777216);
        setIntField(term36168, term36168.getClass(), "denominator", -1478492335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term36168;
        try {
            callMethod(klass, "add", argTypes, term36078, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


