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

public class Fraction_add_2763527041132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364876;
     Object term364958;

    public Fraction_add_2763527041132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364876 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term364876, term364876.getClass(), "numerator", 65536);
        setIntField(term364876, term364876.getClass(), "denominator", 1703921268);
        term364958 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term364958, term364958.getClass(), "numerator", 32);
        setIntField(term364958, term364958.getClass(), "denominator", -1589515126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term364958;
        try {
            callMethod(klass, "add", argTypes, term364876, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


