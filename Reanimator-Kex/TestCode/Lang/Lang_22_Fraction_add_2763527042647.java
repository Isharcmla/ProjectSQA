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

public class Fraction_add_2763527042647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term866088;
     Object term866170;

    public Fraction_add_2763527042647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term866088 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term866088, term866088.getClass(), "numerator", 1073741824);
        setIntField(term866088, term866088.getClass(), "denominator", 1642421444);
        term866170 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term866170, term866170.getClass(), "numerator", 1073741824);
        setIntField(term866170, term866170.getClass(), "denominator", -2024065806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term866170;
        try {
            callMethod(klass, "add", argTypes, term866088, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


