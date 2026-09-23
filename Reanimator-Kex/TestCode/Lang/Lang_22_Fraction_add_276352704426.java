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

public class Fraction_add_276352704426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125386;
     Object term125468;

    public Fraction_add_276352704426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125386 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term125386, term125386.getClass(), "numerator", 268435456);
        setIntField(term125386, term125386.getClass(), "denominator", 708411924);
        term125468 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term125468, term125468.getClass(), "numerator", 16777216);
        setIntField(term125468, term125468.getClass(), "denominator", -960303270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term125468;
        try {
            callMethod(klass, "add", argTypes, term125386, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


