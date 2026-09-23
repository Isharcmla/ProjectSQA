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

public class Fraction_add_276352704517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157908;
     Object term157990;

    public Fraction_add_276352704517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157908 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term157908, term157908.getClass(), "numerator", -2147483648);
        setIntField(term157908, term157908.getClass(), "denominator", 762798220);
        term157990 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term157990, term157990.getClass(), "numerator", -2147483648);
        setIntField(term157990, term157990.getClass(), "denominator", -967987466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term157990;
        try {
            callMethod(klass, "add", argTypes, term157908, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


