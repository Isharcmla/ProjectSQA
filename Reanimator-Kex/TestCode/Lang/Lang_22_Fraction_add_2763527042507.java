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

public class Fraction_add_2763527042507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821153;
     Object term821235;

    public Fraction_add_2763527042507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term821153 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term821153, term821153.getClass(), "numerator", 1073741824);
        setIntField(term821153, term821153.getClass(), "denominator", 1419382700);
        term821235 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term821235, term821235.getClass(), "numerator", 16777216);
        setIntField(term821235, term821235.getClass(), "denominator", -1423917562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term821235;
        try {
            callMethod(klass, "add", argTypes, term821153, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


