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

public class Fraction_multiplyBy_16360464552600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775361;
     Object term775441;

    public Fraction_multiplyBy_16360464552600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775361 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term775361, term775361.getClass(), "numerator", 1885375370);
        term775441 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term775441, term775441.getClass(), "numerator", 1885375106);
        setIntField(term775441, term775441.getClass(), "denominator", 1113359073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term775441;
        try {
            callMethod(klass, "multiplyBy", argTypes, term775361, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


