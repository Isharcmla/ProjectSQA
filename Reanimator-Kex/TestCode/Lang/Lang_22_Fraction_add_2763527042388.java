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

public class Fraction_add_2763527042388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term780818;
     Object term780900;

    public Fraction_add_2763527042388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term780818 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term780818, term780818.getClass(), "numerator", 536870912);
        setIntField(term780818, term780818.getClass(), "denominator", 952638460);
        term780900 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term780900, term780900.getClass(), "numerator", -2147483648);
        setIntField(term780900, term780900.getClass(), "denominator", -1360011794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term780900;
        try {
            callMethod(klass, "add", argTypes, term780818, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


