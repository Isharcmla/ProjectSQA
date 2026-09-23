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

public class Fraction_multiply_752939552602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228833;
     Object term228921;

    public Fraction_multiply_752939552602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228833 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term228833, term228833.getClass(), "numerator", -1881666318);
        term228921 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term228921, term228921.getClass(), "numerator", -1881666318);
        setIntField(term228921, term228921.getClass(), "denominator", -1093385583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term228921;
        callMethod(klass, "multiply", argTypes, term228833, args);
    }

};


