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

public class Fraction_addSub_17792944761560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653184;
     Object term653274;

    public Fraction_addSub_17792944761560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653184 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term653184, term653184.getClass(), "numerator", -1610612736);
        setIntField(term653184, term653184.getClass(), "denominator", -1967652799);
        term653274 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term653274, term653274.getClass(), "numerator", 1610612736);
        setIntField(term653274, term653274.getClass(), "denominator", -849870719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term653274;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term653184, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


