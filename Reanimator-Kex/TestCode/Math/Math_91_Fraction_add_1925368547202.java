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

public class Fraction_add_1925368547202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63362;
     Object term63450;

    public Fraction_add_1925368547202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63362 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term63362, term63362.getClass(), "numerator", 64);
        setIntField(term63362, term63362.getClass(), "denominator", -183500537);
        term63450 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term63450, term63450.getClass(), "numerator", 65536);
        setIntField(term63450, term63450.getClass(), "denominator", 1110877435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term63450;
        try {
            callMethod(klass, "add", argTypes, term63362, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


