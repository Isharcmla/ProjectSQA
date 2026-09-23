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

public class Fraction_add_2763527042451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term801508;
     Object term801590;

    public Fraction_add_2763527042451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term801508 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term801508, term801508.getClass(), "numerator", 16777216);
        setIntField(term801508, term801508.getClass(), "denominator", 1421110508);
        term801590 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term801590, term801590.getClass(), "numerator", 1073741824);
        setIntField(term801590, term801590.getClass(), "denominator", -1963164506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term801590;
        try {
            callMethod(klass, "add", argTypes, term801508, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


