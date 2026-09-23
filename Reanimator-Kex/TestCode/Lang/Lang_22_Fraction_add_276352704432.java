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

public class Fraction_add_276352704432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127460;
     Object term127542;

    public Fraction_add_276352704432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127460 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term127460, term127460.getClass(), "numerator", 1073741824);
        setIntField(term127460, term127460.getClass(), "denominator", 407477740);
        term127542 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term127542, term127542.getClass(), "numerator", 1073741824);
        setIntField(term127542, term127542.getClass(), "denominator", -600468698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term127542;
        try {
            callMethod(klass, "add", argTypes, term127460, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


