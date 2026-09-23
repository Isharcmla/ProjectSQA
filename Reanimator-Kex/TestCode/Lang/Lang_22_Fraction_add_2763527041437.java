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

public class Fraction_add_2763527041437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468555;
     Object term468637;

    public Fraction_add_2763527041437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term468555 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term468555, term468555.getClass(), "numerator", 1073741824);
        setIntField(term468555, term468555.getClass(), "denominator", 1397864620);
        term468637 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term468637, term468637.getClass(), "numerator", 1073741824);
        setIntField(term468637, term468637.getClass(), "denominator", -2096239866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term468637;
        try {
            callMethod(klass, "add", argTypes, term468555, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


