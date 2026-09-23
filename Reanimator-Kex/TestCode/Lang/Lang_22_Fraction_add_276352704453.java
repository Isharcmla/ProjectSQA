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

public class Fraction_add_276352704453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135469;
     Object term135551;

    public Fraction_add_276352704453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135469 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term135469, term135469.getClass(), "numerator", 1073741824);
        setIntField(term135469, term135469.getClass(), "denominator", 655172596);
        term135551 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term135551, term135551.getClass(), "numerator", 1073741824);
        setIntField(term135551, term135551.getClass(), "denominator", -571246262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term135551;
        try {
            callMethod(klass, "add", argTypes, term135469, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


