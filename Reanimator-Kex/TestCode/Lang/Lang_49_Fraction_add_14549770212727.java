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

public class Fraction_add_14549770212727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812577;
     Object term812657;

    public Fraction_add_14549770212727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term812577 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term812577, term812577.getClass(), "numerator", 268435456);
        setIntField(term812577, term812577.getClass(), "denominator", 1175884844);
        term812657 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term812657, term812657.getClass(), "numerator", 1073741824);
        setIntField(term812657, term812657.getClass(), "denominator", -1140825658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term812657;
        try {
            callMethod(klass, "add", argTypes, term812577, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


