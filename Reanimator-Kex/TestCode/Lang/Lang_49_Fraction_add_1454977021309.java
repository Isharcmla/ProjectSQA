package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1454977021309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80809;
     Object term80889;

    public Fraction_add_1454977021309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80809 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term80809, term80809.getClass(), "numerator", -2147483648);
        setIntField(term80809, term80809.getClass(), "denominator", 1077933596);
        term80889 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term80889, term80889.getClass(), "numerator", 1024);
        setIntField(term80889, term80889.getClass(), "denominator", -1075842306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term80889;
        try {
            callMethod(klass, "add", argTypes, term80809, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


