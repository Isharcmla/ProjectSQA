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

public class Fraction_add_276352704467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139979;
     Object term140061;

    public Fraction_add_276352704467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139979 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term139979, term139979.getClass(), "numerator", 536870912);
        setIntField(term139979, term139979.getClass(), "denominator", 11669724);
        term140061 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term140061, term140061.getClass(), "numerator", -2147483648);
        setIntField(term140061, term140061.getClass(), "denominator", -17373346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term140061;
        try {
            callMethod(klass, "add", argTypes, term139979, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


