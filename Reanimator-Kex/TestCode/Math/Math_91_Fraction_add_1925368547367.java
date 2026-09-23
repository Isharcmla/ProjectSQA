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

public class Fraction_add_1925368547367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126097;
     Object term126185;

    public Fraction_add_1925368547367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126097 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term126097, term126097.getClass(), "numerator", -2147483648);
        setIntField(term126097, term126097.getClass(), "denominator", -134142259);
        term126185 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term126185, term126185.getClass(), "numerator", 512);
        setIntField(term126185, term126185.getClass(), "denominator", 2003965641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term126185;
        try {
            callMethod(klass, "add", argTypes, term126097, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


