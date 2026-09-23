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

public class Fraction_add_1925368547481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175260;
     Object term175348;

    public Fraction_add_1925368547481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175260 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term175260, term175260.getClass(), "numerator", 512);
        setIntField(term175260, term175260.getClass(), "denominator", -167343319);
        term175348 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term175348, term175348.getClass(), "numerator", 32768);
        setIntField(term175348, term175348.getClass(), "denominator", 1179649749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term175348;
        try {
            callMethod(klass, "add", argTypes, term175260, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


