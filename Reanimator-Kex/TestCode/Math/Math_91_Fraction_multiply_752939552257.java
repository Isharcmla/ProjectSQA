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

public class Fraction_multiply_752939552257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83444;
     Object term83532;

    public Fraction_multiply_752939552257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83444 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term83444, term83444.getClass(), "numerator", -536870862);
        term83532 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term83532, term83532.getClass(), "numerator", 16);
        setIntField(term83532, term83532.getClass(), "denominator", -536870863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term83532;
        callMethod(klass, "multiply", argTypes, term83444, args);
    }

};


