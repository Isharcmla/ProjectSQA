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

public class Fraction_add_192536854791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20274;
     Object term20362;

    public Fraction_add_192536854791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20274 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term20274, term20274.getClass(), "numerator", 32);
        setIntField(term20274, term20274.getClass(), "denominator", -654043135);
        term20362 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term20362, term20362.getClass(), "numerator", 8192);
        setIntField(term20362, term20362.getClass(), "denominator", 2065435213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term20362;
        try {
            callMethod(klass, "add", argTypes, term20274, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


