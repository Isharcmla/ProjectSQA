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

public class Fraction_add_2763527042044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664947;
     Object term665029;

    public Fraction_add_2763527042044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664947 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term664947, term664947.getClass(), "numerator", 4096);
        setIntField(term664947, term664947.getClass(), "denominator", 1414556652);
        term665029 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term665029, term665029.getClass(), "numerator", -2147483648);
        setIntField(term665029, term665029.getClass(), "denominator", -2125312842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term665029;
        try {
            callMethod(klass, "add", argTypes, term664947, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


