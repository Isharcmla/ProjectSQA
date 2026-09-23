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

public class Fraction_add_2763527041031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331138;
     Object term331220;

    public Fraction_add_2763527041031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331138 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term331138, term331138.getClass(), "numerator", 1073741824);
        setIntField(term331138, term331138.getClass(), "denominator", 1437587412);
        term331220 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term331220, term331220.getClass(), "numerator", 1073741824);
        setIntField(term331220, term331220.getClass(), "denominator", -2147349958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term331220;
        try {
            callMethod(klass, "add", argTypes, term331138, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


