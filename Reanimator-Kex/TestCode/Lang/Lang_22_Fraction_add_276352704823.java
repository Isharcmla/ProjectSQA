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

public class Fraction_add_276352704823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260242;
     Object term260324;

    public Fraction_add_276352704823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260242 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term260242, term260242.getClass(), "numerator", 1073741824);
        setIntField(term260242, term260242.getClass(), "denominator", 1073741825);
        term260324 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term260324, term260324.getClass(), "numerator", -2147483648);
        setIntField(term260324, term260324.getClass(), "denominator", -65536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term260324;
        try {
            callMethod(klass, "add", argTypes, term260242, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


