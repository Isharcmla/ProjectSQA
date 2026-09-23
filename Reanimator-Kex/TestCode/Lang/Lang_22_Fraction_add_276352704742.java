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

public class Fraction_add_276352704742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234511;
     Object term234593;

    public Fraction_add_276352704742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234511 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term234511, term234511.getClass(), "numerator", -2147483648);
        setIntField(term234511, term234511.getClass(), "denominator", 1263314716);
        term234593 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term234593, term234593.getClass(), "numerator", 1024);
        setIntField(term234593, term234593.getClass(), "denominator", -1769106562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term234593;
        try {
            callMethod(klass, "add", argTypes, term234511, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


