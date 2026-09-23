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

public class Fraction_multiplyBy_4574221382442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798495;
     Object term798577;

    public Fraction_multiplyBy_4574221382442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798495 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term798495, term798495.getClass(), "numerator", 132506378);
        term798577 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term798577, term798577.getClass(), "numerator", 23069466);
        setIntField(term798577, term798577.getClass(), "denominator", 1879841193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term798577;
        try {
            callMethod(klass, "multiplyBy", argTypes, term798495, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


