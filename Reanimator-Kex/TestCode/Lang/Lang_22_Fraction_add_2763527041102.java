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

public class Fraction_add_2763527041102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352996;
     Object term353078;

    public Fraction_add_2763527041102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352996 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term352996, term352996.getClass(), "numerator", 524288);
        setIntField(term352996, term352996.getClass(), "denominator", 831763476);
        term353078 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term353078, term353078.getClass(), "numerator", 1048576);
        setIntField(term353078, term353078.getClass(), "denominator", -1398735030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term353078;
        try {
            callMethod(klass, "add", argTypes, term352996, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


