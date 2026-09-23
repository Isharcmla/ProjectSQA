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

public class Fraction_subtract_2650031231918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624945;
     Object term625027;

    public Fraction_subtract_2650031231918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624945 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term624945, term624945.getClass(), "numerator", 512);
        setIntField(term624945, term624945.getClass(), "denominator", -461985144);
        term625027 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term625027, term625027.getClass(), "numerator", 268435456);
        setIntField(term625027, term625027.getClass(), "denominator", 287177060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term625027;
        try {
            callMethod(klass, "subtract", argTypes, term624945, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


