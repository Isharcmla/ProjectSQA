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

public class Fraction_add_1925368547117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29118;
     Object term29206;

    public Fraction_add_1925368547117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29118 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term29118, term29118.getClass(), "numerator", 524288);
        setIntField(term29118, term29118.getClass(), "denominator", -134213619);
        term29206 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term29206, term29206.getClass(), "numerator", 128);
        setIntField(term29206, term29206.getClass(), "denominator", 1006694441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term29206;
        try {
            callMethod(klass, "add", argTypes, term29118, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


