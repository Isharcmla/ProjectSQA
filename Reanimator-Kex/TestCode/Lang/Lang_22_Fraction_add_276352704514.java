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

public class Fraction_add_276352704514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156565;
     Object term156647;

    public Fraction_add_276352704514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156565 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term156565, term156565.getClass(), "numerator", 262144);
        setIntField(term156565, term156565.getClass(), "denominator", 1226713740);
        term156647 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term156647, term156647.getClass(), "numerator", -2147483648);
        setIntField(term156647, term156647.getClass(), "denominator", -1435566858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term156647;
        try {
            callMethod(klass, "add", argTypes, term156565, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


