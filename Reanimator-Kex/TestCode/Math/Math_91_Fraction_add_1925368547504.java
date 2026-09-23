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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186500;
     Object term186588;

    public Fraction_add_1925368547504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186500 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term186500, term186500.getClass(), "numerator", 524288);
        setIntField(term186500, term186500.getClass(), "denominator", -568548711);
        term186588 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term186588, term186588.getClass(), "numerator", 1073741824);
        setIntField(term186588, term186588.getClass(), "denominator", 1812073893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term186588;
        callMethod(klass, "add", argTypes, term186500, args);
    }

};


