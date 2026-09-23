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

public class Fraction_add_1925368547679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255000;
     Object term255088;

    public Fraction_add_1925368547679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255000 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term255000, term255000.getClass(), "numerator", 1073741824);
        setIntField(term255000, term255000.getClass(), "denominator", -60286087);
        term255088 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term255088, term255088.getClass(), "numerator", 1073741824);
        setIntField(term255088, term255088.getClass(), "denominator", 1206909861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term255088;
        try {
            callMethod(klass, "add", argTypes, term255000, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


