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

public class Fraction_add_2763527042246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732770;
     Object term732852;

    public Fraction_add_2763527042246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732770 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term732770, term732770.getClass(), "numerator", 1024);
        setIntField(term732770, term732770.getClass(), "denominator", 375369172);
        term732852 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term732852, term732852.getClass(), "numerator", 512);
        setIntField(term732852, term732852.getClass(), "denominator", -336791878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term732852;
        try {
            callMethod(klass, "add", argTypes, term732770, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


