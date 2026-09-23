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

public class Fraction_multiplyBy_457422138408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118456;
     Object term118538;

    public Fraction_multiplyBy_457422138408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118456 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term118456, term118456.getClass(), "numerator", 103020486);
        setIntField(term118456, term118456.getClass(), "denominator", -1342177280);
        term118538 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term118538, term118538.getClass(), "numerator", 940836905);
        setIntField(term118538, term118538.getClass(), "denominator", 1728050143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term118538;
        try {
            callMethod(klass, "multiplyBy", argTypes, term118456, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


