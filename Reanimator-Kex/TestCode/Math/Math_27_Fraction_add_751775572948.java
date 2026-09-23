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

public class Fraction_add_751775572948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397141;
     Object term397231;

    public Fraction_add_751775572948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397141 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term397141, term397141.getClass(), "numerator", 67108864);
        setIntField(term397141, term397141.getClass(), "denominator", -1644150702);
        term397231 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term397231, term397231.getClass(), "numerator", 8388608);
        setIntField(term397231, term397231.getClass(), "denominator", -1275609727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term397231;
        try {
            callMethod(klass, "add", argTypes, term397141, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


