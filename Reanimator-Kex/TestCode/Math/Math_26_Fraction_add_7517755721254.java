package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_7517755721254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625896;
     Object term625986;

    public Fraction_add_7517755721254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625896 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term625896, term625896.getClass(), "numerator", 134217728);
        setIntField(term625896, term625896.getClass(), "denominator", -2107505086);
        term625986 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term625986, term625986.getClass(), "numerator", 32768);
        setIntField(term625986, term625986.getClass(), "denominator", -1624189367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term625986;
        try {
            callMethod(klass, "add", argTypes, term625896, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


