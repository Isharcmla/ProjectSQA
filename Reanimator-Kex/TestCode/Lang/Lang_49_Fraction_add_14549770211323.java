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

public class Fraction_add_14549770211323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386902;
     Object term386982;

    public Fraction_add_14549770211323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386902 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term386902, term386902.getClass(), "numerator", 4);
        setIntField(term386902, term386902.getClass(), "denominator", 854648572);
        term386982 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term386982, term386982.getClass(), "numerator", 8388608);
        setIntField(term386982, term386982.getClass(), "denominator", -1132022034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term386982;
        try {
            callMethod(klass, "add", argTypes, term386902, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


