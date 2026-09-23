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

public class Fraction_add_1925368547534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199351;
     Object term199439;

    public Fraction_add_1925368547534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199351 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term199351, term199351.getClass(), "numerator", 256);
        setIntField(term199351, term199351.getClass(), "denominator", -671083923);
        term199439 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term199439, term199439.getClass(), "numerator", 8192);
        setIntField(term199439, term199439.getClass(), "denominator", 2064647785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term199439;
        try {
            callMethod(klass, "add", argTypes, term199351, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


