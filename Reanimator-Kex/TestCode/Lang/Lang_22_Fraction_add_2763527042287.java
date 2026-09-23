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

public class Fraction_add_2763527042287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746965;
     Object term747047;

    public Fraction_add_2763527042287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746965 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term746965, term746965.getClass(), "numerator", 1073741824);
        setIntField(term746965, term746965.getClass(), "denominator", 1361317692);
        term747047 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term747047, term747047.getClass(), "numerator", 16384);
        setIntField(term747047, term747047.getClass(), "denominator", -1939658098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term747047;
        try {
            callMethod(klass, "add", argTypes, term746965, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


