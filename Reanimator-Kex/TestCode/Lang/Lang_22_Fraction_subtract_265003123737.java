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

public class Fraction_subtract_265003123737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232997;
     Object term233079;

    public Fraction_subtract_265003123737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232997 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term232997, term232997.getClass(), "numerator", 2048);
        setIntField(term232997, term232997.getClass(), "denominator", -276835960);
        term233079 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term233079, term233079.getClass(), "numerator", 16777216);
        setIntField(term233079, term233079.getClass(), "denominator", 143383780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term233079;
        try {
            callMethod(klass, "subtract", argTypes, term232997, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


