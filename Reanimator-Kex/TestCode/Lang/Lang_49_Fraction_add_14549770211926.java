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

public class Fraction_add_14549770211926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566113;
     Object term566193;

    public Fraction_add_14549770211926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566113 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term566113, term566113.getClass(), "numerator", 536870912);
        setIntField(term566113, term566113.getClass(), "denominator", 980);
        term566193 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term566193, term566193.getClass(), "numerator", 128);
        setIntField(term566193, term566193.getClass(), "denominator", -1350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term566193;
        try {
            callMethod(klass, "add", argTypes, term566113, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


