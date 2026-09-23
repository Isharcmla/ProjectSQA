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

public class Fraction_add_2763527041950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636408;
     Object term636490;

    public Fraction_add_2763527041950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636408 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term636408, term636408.getClass(), "numerator", -2147483648);
        setIntField(term636408, term636408.getClass(), "denominator", 6604);
        term636490 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term636490, term636490.getClass(), "numerator", -2147483648);
        setIntField(term636490, term636490.getClass(), "denominator", -7018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term636490;
        try {
            callMethod(klass, "add", argTypes, term636408, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


