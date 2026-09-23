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

public class Fraction_add_276352704283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78116;
     Object term78198;

    public Fraction_add_276352704283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78116 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term78116, term78116.getClass(), "numerator", 268435456);
        setIntField(term78116, term78116.getClass(), "denominator", 1418717420);
        term78198 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term78198, term78198.getClass(), "numerator", 1073741824);
        setIntField(term78198, term78198.getClass(), "denominator", -1984413018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term78198;
        try {
            callMethod(klass, "add", argTypes, term78116, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


