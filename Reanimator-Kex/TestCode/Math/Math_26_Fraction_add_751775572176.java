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

public class Fraction_add_751775572176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61753;
     Object term61843;

    public Fraction_add_751775572176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61753 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term61753, term61753.getClass(), "numerator", 4194304);
        setIntField(term61753, term61753.getClass(), "denominator", -281282510);
        term61843 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term61843, term61843.getClass(), "numerator", 128);
        setIntField(term61843, term61843.getClass(), "denominator", -267615391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term61843;
        try {
            callMethod(klass, "add", argTypes, term61753, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


