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

public class Fraction_add_14549770211134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328175;
     Object term328255;

    public Fraction_add_14549770211134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328175 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term328175, term328175.getClass(), "numerator", -2147483648);
        setIntField(term328175, term328175.getClass(), "denominator", 952171804);
        term328255 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term328255, term328255.getClass(), "numerator", 128);
        setIntField(term328255, term328255.getClass(), "denominator", -1089719170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term328255;
        try {
            callMethod(klass, "add", argTypes, term328175, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


