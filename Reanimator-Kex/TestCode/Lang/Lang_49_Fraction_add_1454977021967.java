package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1454977021967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277195;
     Object term277275;

    public Fraction_add_1454977021967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277195 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term277195, term277195.getClass(), "numerator", -2147483648);
        setIntField(term277195, term277195.getClass(), "denominator", 139947580);
        term277275 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term277275, term277275.getClass(), "numerator", 128);
        setIntField(term277275, term277275.getClass(), "denominator", -204785394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term277275;
        try {
            callMethod(klass, "add", argTypes, term277195, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


