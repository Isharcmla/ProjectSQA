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

public class Fraction_add_2763527042352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term768148;
     Object term768230;

    public Fraction_add_2763527042352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term768148 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term768148, term768148.getClass(), "numerator", 1073741824);
        setIntField(term768148, term768148.getClass(), "denominator", 1378344188);
        term768230 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term768230, term768230.getClass(), "numerator", 1073741824);
        setIntField(term768230, term768230.getClass(), "denominator", -2065153298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term768230;
        try {
            callMethod(klass, "add", argTypes, term768148, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


