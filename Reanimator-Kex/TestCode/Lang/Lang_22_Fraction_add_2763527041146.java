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

public class Fraction_add_2763527041146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369779;
     Object term369861;

    public Fraction_add_2763527041146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369779 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term369779, term369779.getClass(), "numerator", 2);
        setIntField(term369779, term369779.getClass(), "denominator", 386864876);
        term369861 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term369861, term369861.getClass(), "numerator", 4194304);
        setIntField(term369861, term369861.getClass(), "denominator", -595915210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term369861;
        try {
            callMethod(klass, "add", argTypes, term369779, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


