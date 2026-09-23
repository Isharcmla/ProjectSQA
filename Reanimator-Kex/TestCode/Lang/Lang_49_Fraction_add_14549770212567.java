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

public class Fraction_add_14549770212567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term765498;
     Object term765578;

    public Fraction_add_14549770212567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term765498 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term765498, term765498.getClass(), "numerator", 16777216);
        setIntField(term765498, term765498.getClass(), "denominator", 4559388);
        term765578 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term765578, term765578.getClass(), "numerator", 33554432);
        setIntField(term765578, term765578.getClass(), "denominator", -6662402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term765578;
        try {
            callMethod(klass, "add", argTypes, term765498, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


