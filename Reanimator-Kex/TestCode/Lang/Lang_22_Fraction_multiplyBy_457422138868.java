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

public class Fraction_multiplyBy_457422138868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276922;
     Object term277004;

    public Fraction_multiplyBy_457422138868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276922 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term276922, term276922.getClass(), "numerator", 1857373162);
        term277004 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term277004, term277004.getClass(), "numerator", 1857373162);
        setIntField(term277004, term277004.getClass(), "denominator", 1885357065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term277004;
        try {
            callMethod(klass, "multiplyBy", argTypes, term276922, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


