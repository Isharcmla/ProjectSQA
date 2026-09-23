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

public class Fraction_subtract_14436274402037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598421;
     Object term598501;

    public Fraction_subtract_14436274402037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term598421 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term598421, term598421.getClass(), "numerator", 1073741824);
        setIntField(term598421, term598421.getClass(), "denominator", -234924168);
        term598501 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term598501, term598501.getClass(), "numerator", 134217728);
        setIntField(term598501, term598501.getClass(), "denominator", 195769244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term598501;
        try {
            callMethod(klass, "subtract", argTypes, term598421, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


