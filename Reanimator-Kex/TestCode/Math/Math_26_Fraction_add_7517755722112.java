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

public class Fraction_add_7517755722112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049971;
     Object term1050061;

    public Fraction_add_7517755722112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049971 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1049971, term1049971.getClass(), "numerator", 1048576);
        setIntField(term1049971, term1049971.getClass(), "denominator", -2005921694);
        term1050061 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1050061, term1050061.getClass(), "numerator", 131072);
        setIntField(term1050061, term1050061.getClass(), "denominator", -1949212659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1050061;
        try {
            callMethod(klass, "add", argTypes, term1049971, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


