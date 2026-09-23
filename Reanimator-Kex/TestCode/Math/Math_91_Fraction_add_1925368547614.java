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

public class Fraction_add_1925368547614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233177;
     Object term233265;

    public Fraction_add_1925368547614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233177 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term233177, term233177.getClass(), "numerator", 1073741824);
        setIntField(term233177, term233177.getClass(), "denominator", -235402425);
        term233265 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term233265, term233265.getClass(), "numerator", 134217728);
        setIntField(term233265, term233265.getClass(), "denominator", 1388595899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term233265;
        try {
            callMethod(klass, "add", argTypes, term233177, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


