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

public class Fraction_multiplyBy_457422138516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157176;
     Object term157258;

    public Fraction_multiplyBy_457422138516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157176 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term157176, term157176.getClass(), "numerator", 247994150);
        setIntField(term157176, term157176.getClass(), "denominator", -536870912);
        term157258 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term157258, term157258.getClass(), "numerator", 268437569);
        setIntField(term157258, term157258.getClass(), "denominator", 912790311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term157258;
        try {
            callMethod(klass, "multiplyBy", argTypes, term157176, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


