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

public class Fraction_add_2763527041573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512336;
     Object term512418;

    public Fraction_add_2763527041573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512336 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term512336, term512336.getClass(), "numerator", 1073741824);
        setIntField(term512336, term512336.getClass(), "denominator", 1135800412);
        term512418 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term512418, term512418.getClass(), "numerator", 1073741824);
        setIntField(term512418, term512418.getClass(), "denominator", -1434215906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term512418;
        try {
            callMethod(klass, "add", argTypes, term512336, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


