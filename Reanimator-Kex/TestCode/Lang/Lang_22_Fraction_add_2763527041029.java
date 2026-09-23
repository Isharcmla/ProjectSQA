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

public class Fraction_add_2763527041029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330333;
     Object term330415;

    public Fraction_add_2763527041029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330333 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term330333, term330333.getClass(), "numerator", 4);
        setIntField(term330333, term330333.getClass(), "denominator", 386364236);
        term330415 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term330415, term330415.getClass(), "numerator", -2147483648);
        setIntField(term330415, term330415.getClass(), "denominator", -381344938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term330415;
        try {
            callMethod(klass, "add", argTypes, term330333, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


