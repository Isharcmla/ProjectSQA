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

public class Fraction_add_276352704661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208582;
     Object term208664;

    public Fraction_add_276352704661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208582 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term208582, term208582.getClass(), "numerator", 67108864);
        setIntField(term208582, term208582.getClass(), "denominator", 1073741825);
        term208664 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term208664, term208664.getClass(), "numerator", 32);
        setIntField(term208664, term208664.getClass(), "denominator", -65536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term208664;
        try {
            callMethod(klass, "add", argTypes, term208582, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


