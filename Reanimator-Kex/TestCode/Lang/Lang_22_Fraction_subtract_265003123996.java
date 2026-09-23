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

public class Fraction_subtract_265003123996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319372;
     Object term319454;

    public Fraction_subtract_265003123996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319372 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term319372, term319372.getClass(), "numerator", 4194304);
        setIntField(term319372, term319372.getClass(), "denominator", -270664376);
        term319454 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term319454, term319454.getClass(), "numerator", 33554432);
        setIntField(term319454, term319454.getClass(), "denominator", 158699716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term319454;
        try {
            callMethod(klass, "subtract", argTypes, term319372, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


