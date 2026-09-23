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

public class Fraction_multiplyBy_457422138350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100185;
     Object term100267;

    public Fraction_multiplyBy_457422138350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100185 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term100185, term100185.getClass(), "numerator", 401272802);
        term100267 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term100267, term100267.getClass(), "numerator", 115918562);
        setIntField(term100267, term100267.getClass(), "denominator", 1896658957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term100267;
        try {
            callMethod(klass, "multiplyBy", argTypes, term100185, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


