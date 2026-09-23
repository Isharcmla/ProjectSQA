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

public class Fraction_multiplyBy_4574221382291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748019;
     Object term748101;

    public Fraction_multiplyBy_4574221382291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term748019 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term748019, term748019.getClass(), "numerator", 688128166);
        setIntField(term748019, term748019.getClass(), "denominator", 562454017);
        term748101 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term748101, term748101.getClass(), "numerator", 375029958);
        setIntField(term748101, term748101.getClass(), "denominator", 2013528143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term748101;
        try {
            callMethod(klass, "multiplyBy", argTypes, term748019, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


