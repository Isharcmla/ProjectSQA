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

public class Fraction_subtract_265003123598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185296;
     Object term185378;

    public Fraction_subtract_265003123598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185296 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term185296, term185296.getClass(), "numerator", 16);
        setIntField(term185296, term185296.getClass(), "denominator", -658523288);
        term185378 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term185378, term185378.getClass(), "numerator", 4096);
        setIntField(term185378, term185378.getClass(), "denominator", 543187796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term185378;
        try {
            callMethod(klass, "subtract", argTypes, term185296, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


