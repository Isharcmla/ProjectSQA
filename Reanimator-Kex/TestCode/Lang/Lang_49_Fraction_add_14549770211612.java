package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_14549770211612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473317;
     Object term473397;

    public Fraction_add_14549770211612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473317 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term473317, term473317.getClass(), "numerator", 67108864);
        setIntField(term473317, term473317.getClass(), "denominator", 944287876);
        term473397 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term473397, term473397.getClass(), "numerator", 16);
        setIntField(term473397, term473397.getClass(), "denominator", -1249139118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term473397;
        try {
            callMethod(klass, "add", argTypes, term473317, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


