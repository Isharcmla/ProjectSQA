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

public class Fraction_add_7517755722105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1046862;
     Object term1046952;

    public Fraction_add_7517755722105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1046862 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1046862, term1046862.getClass(), "numerator", 2048);
        setIntField(term1046862, term1046862.getClass(), "denominator", -2140934894);
        term1046952 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1046952, term1046952.getClass(), "numerator", 33554432);
        setIntField(term1046952, term1046952.getClass(), "denominator", -1226279775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1046952;
        try {
            callMethod(klass, "add", argTypes, term1046862, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


