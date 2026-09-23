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

public class Fraction_add_1925368547652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246371;
     Object term246459;

    public Fraction_add_1925368547652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246371 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term246371, term246371.getClass(), "numerator", 1073741824);
        setIntField(term246371, term246371.getClass(), "denominator", -528898337);
        term246459 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term246459, term246459.getClass(), "numerator", 1073741824);
        setIntField(term246459, term246459.getClass(), "denominator", 2138435571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term246459;
        try {
            callMethod(klass, "add", argTypes, term246371, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


