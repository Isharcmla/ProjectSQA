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

public class Fraction_add_1925368547624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237314;
     Object term237402;

    public Fraction_add_1925368547624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237314 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term237314, term237314.getClass(), "numerator", 134217728);
        setIntField(term237314, term237314.getClass(), "denominator", -243114087);
        term237402 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term237402, term237402.getClass(), "numerator", 2048);
        setIntField(term237402, term237402.getClass(), "denominator", 809901413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term237402;
        try {
            callMethod(klass, "add", argTypes, term237314, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


