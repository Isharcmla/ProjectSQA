package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223425;
     Object term223513;

    public Fraction_add_1925368547590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223425 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term223425, term223425.getClass(), "numerator", 8192);
        setIntField(term223425, term223425.getClass(), "denominator", -2116023314);
        term223513 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term223513, term223513.getClass(), "numerator", -2147483648);
        setIntField(term223513, term223513.getClass(), "denominator", 367526293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term223513;
        try {
            callMethod(klass, "add", argTypes, term223425, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


