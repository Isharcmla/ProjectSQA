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

public class Fraction_add_751775572647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301232;
     Object term301322;

    public Fraction_add_751775572647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301232 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term301232, term301232.getClass(), "numerator", 536870912);
        setIntField(term301232, term301232.getClass(), "denominator", -2145861118);
        term301322 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term301322, term301322.getClass(), "numerator", 16384);
        setIntField(term301322, term301322.getClass(), "denominator", -1955538567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term301322;
        try {
            callMethod(klass, "add", argTypes, term301232, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


