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

public class Fraction_addSub_177929447693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22392;
     Object term22482;

    public Fraction_addSub_177929447693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22392 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term22392, term22392.getClass(), "numerator", 1073741824);
        setIntField(term22392, term22392.getClass(), "denominator", -1879171135);
        term22482 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term22482, term22482.getClass(), "numerator", -1610612734);
        setIntField(term22482, term22482.getClass(), "denominator", -536870911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term22482;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term22392, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


