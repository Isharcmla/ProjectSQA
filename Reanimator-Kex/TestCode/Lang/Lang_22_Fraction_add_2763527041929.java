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

public class Fraction_add_2763527041929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629008;
     Object term629090;

    public Fraction_add_2763527041929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term629008 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term629008, term629008.getClass(), "numerator", 536870912);
        setIntField(term629008, term629008.getClass(), "denominator", 1705724);
        term629090 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term629090, term629090.getClass(), "numerator", 1024);
        setIntField(term629090, term629090.getClass(), "denominator", -2296210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term629090;
        try {
            callMethod(klass, "add", argTypes, term629008, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


