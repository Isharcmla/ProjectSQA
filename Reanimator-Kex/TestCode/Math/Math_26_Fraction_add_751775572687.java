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

public class Fraction_add_751775572687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322339;
     Object term322429;

    public Fraction_add_751775572687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322339 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term322339, term322339.getClass(), "numerator", -2147483648);
        setIntField(term322339, term322339.getClass(), "denominator", -229318);
        term322429 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term322429, term322429.getClass(), "numerator", -2147483648);
        setIntField(term322429, term322429.getClass(), "denominator", -2147467231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term322429;
        try {
            callMethod(klass, "add", argTypes, term322339, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


