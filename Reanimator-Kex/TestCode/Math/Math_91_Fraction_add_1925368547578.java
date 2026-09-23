package org.apache.commons.math.fraction;

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
import java.lang.ArithmeticException;
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216807;
     Object term216895;

    public Fraction_add_1925368547578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216807 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term216807, term216807.getClass(), "numerator", 65536);
        setIntField(term216807, term216807.getClass(), "denominator", -1259020855);
        term216895 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term216895, term216895.getClass(), "numerator", 2);
        setIntField(term216895, term216895.getClass(), "denominator", 1256907159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term216895;
        try {
            callMethod(klass, "add", argTypes, term216807, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


