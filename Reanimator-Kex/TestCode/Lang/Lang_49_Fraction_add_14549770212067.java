package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_14549770212067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608219;
     Object term608299;

    public Fraction_add_14549770212067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608219 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term608219, term608219.getClass(), "numerator", 262144);
        setIntField(term608219, term608219.getClass(), "denominator", 1524153996);
        term608299 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term608299, term608299.getClass(), "numerator", 268435456);
        setIntField(term608299, term608299.getClass(), "denominator", -1464010378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term608299;
        try {
            callMethod(klass, "add", argTypes, term608219, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


