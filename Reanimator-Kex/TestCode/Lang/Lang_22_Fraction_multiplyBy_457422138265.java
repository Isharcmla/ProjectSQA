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

public class Fraction_multiplyBy_457422138265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71086;
     Object term71168;

    public Fraction_multiplyBy_457422138265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71086 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term71086, term71086.getClass(), "numerator", 50331346);
        term71168 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term71168, term71168.getClass(), "numerator", 50331346);
        setIntField(term71168, term71168.getClass(), "denominator", 1770586237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term71168;
        try {
            callMethod(klass, "multiplyBy", argTypes, term71086, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


