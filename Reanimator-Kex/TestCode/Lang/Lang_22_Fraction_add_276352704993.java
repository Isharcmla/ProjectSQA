package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_276352704993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318272;
     Object term318354;

    public Fraction_add_276352704993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318272 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term318272, term318272.getClass(), "numerator", 262144);
        setIntField(term318272, term318272.getClass(), "denominator", 553951132);
        term318354 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term318354, term318354.getClass(), "numerator", -2147483648);
        setIntField(term318354, term318354.getClass(), "denominator", -492876226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term318354;
        try {
            callMethod(klass, "add", argTypes, term318272, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


