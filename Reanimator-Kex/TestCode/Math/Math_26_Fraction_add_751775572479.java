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

public class Fraction_add_751775572479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215660;
     Object term215750;

    public Fraction_add_751775572479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215660 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term215660, term215660.getClass(), "numerator", 2048);
        setIntField(term215660, term215660.getClass(), "denominator", -737639422);
        term215750 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term215750, term215750.getClass(), "numerator", -2147483648);
        setIntField(term215750, term215750.getClass(), "denominator", -1515004551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term215750;
        try {
            callMethod(klass, "add", argTypes, term215660, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


