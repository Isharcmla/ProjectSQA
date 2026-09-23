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

public class Fraction_add_2763527042314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755845;
     Object term755927;

    public Fraction_add_2763527042314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term755845 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term755845, term755845.getClass(), "numerator", -2147483648);
        setIntField(term755845, term755845.getClass(), "denominator", 1857991324);
        term755927 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term755927, term755927.getClass(), "numerator", -2147483648);
        setIntField(term755927, term755927.getClass(), "denominator", -1939968066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term755927;
        try {
            callMethod(klass, "add", argTypes, term755845, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


