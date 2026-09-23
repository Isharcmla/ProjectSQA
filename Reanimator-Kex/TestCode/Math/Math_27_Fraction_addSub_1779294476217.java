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

public class Fraction_addSub_1779294476217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79229;
     Object term79319;

    public Fraction_addSub_1779294476217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79229 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term79229, term79229.getClass(), "numerator", 65536);
        setIntField(term79229, term79229.getClass(), "denominator", -2008682879);
        term79319 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term79319, term79319.getClass(), "numerator", 65536);
        setIntField(term79319, term79319.getClass(), "denominator", -163966655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term79319;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term79229, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


