package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_7517755722109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1048491;
     Object term1048581;

    public Fraction_add_7517755722109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1048491 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1048491, term1048491.getClass(), "numerator", -2147483648);
        setIntField(term1048491, term1048491.getClass(), "denominator", -1067446462);
        term1048581 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1048581, term1048581.getClass(), "numerator", -2147483648);
        setIntField(term1048581, term1048581.getClass(), "denominator", -668536423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1048581;
        try {
            callMethod(klass, "add", argTypes, term1048491, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


