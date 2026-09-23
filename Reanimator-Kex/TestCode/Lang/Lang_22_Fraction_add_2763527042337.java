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

public class Fraction_add_2763527042337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term763141;
     Object term763223;

    public Fraction_add_2763527042337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term763141 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term763141, term763141.getClass(), "numerator", 128);
        setIntField(term763141, term763141.getClass(), "denominator", 181817492);
        term763223 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term763223, term763223.getClass(), "numerator", 8);
        setIntField(term763223, term763223.getClass(), "denominator", -183768678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term763223;
        try {
            callMethod(klass, "add", argTypes, term763141, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


