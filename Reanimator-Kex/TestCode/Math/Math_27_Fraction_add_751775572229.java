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

public class Fraction_add_751775572229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84639;
     Object term84729;

    public Fraction_add_751775572229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84639 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term84639, term84639.getClass(), "numerator", 536870912);
        setIntField(term84639, term84639.getClass(), "denominator", -382877694);
        term84729 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term84729, term84729.getClass(), "numerator", 16);
        setIntField(term84729, term84729.getClass(), "denominator", -1545416519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term84729;
        try {
            callMethod(klass, "add", argTypes, term84639, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


