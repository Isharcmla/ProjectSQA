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

public class Fraction_add_7517755721485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741141;
     Object term741231;

    public Fraction_add_7517755721485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741141 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term741141, term741141.getClass(), "numerator", 64);
        setIntField(term741141, term741141.getClass(), "denominator", -974909374);
        term741231 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term741231, term741231.getClass(), "numerator", 524288);
        setIntField(term741231, term741231.getClass(), "denominator", -1140032375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term741231;
        try {
            callMethod(klass, "add", argTypes, term741141, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


