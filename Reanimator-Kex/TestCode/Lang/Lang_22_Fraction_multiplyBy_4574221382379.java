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

public class Fraction_multiplyBy_4574221382379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778021;
     Object term778103;

    public Fraction_multiplyBy_4574221382379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term778021 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term778021, term778021.getClass(), "numerator", 1645182722);
        setIntField(term778021, term778021.getClass(), "denominator", -2147483648);
        term778103 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term778103, term778103.getClass(), "numerator", 268435497);
        setIntField(term778103, term778103.getClass(), "denominator", 1611138557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term778103;
        try {
            callMethod(klass, "multiplyBy", argTypes, term778021, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


