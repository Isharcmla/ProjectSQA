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

public class Fraction_add_276352704620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193111;
     Object term193193;

    public Fraction_add_276352704620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193111 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term193111, term193111.getClass(), "numerator", -2147483648);
        setIntField(term193111, term193111.getClass(), "denominator", 1073741825);
        term193193 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term193193, term193193.getClass(), "numerator", -2147483648);
        setIntField(term193193, term193193.getClass(), "denominator", -4227072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term193193;
        try {
            callMethod(klass, "add", argTypes, term193111, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


