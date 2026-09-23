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

public class Fraction_add_1925368547552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206778;
     Object term206866;

    public Fraction_add_1925368547552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206778 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term206778, term206778.getClass(), "numerator", -2147483648);
        setIntField(term206778, term206778.getClass(), "denominator", -179268605);
        term206866 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term206866, term206866.getClass(), "numerator", 33554432);
        setIntField(term206866, term206866.getClass(), "denominator", 554858407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term206866;
        try {
            callMethod(klass, "add", argTypes, term206778, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


