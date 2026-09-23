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

public class Fraction_add_7517755721188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589745;
     Object term589835;

    public Fraction_add_7517755721188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589745 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term589745, term589745.getClass(), "numerator", -2147483648);
        setIntField(term589745, term589745.getClass(), "denominator", -503315198);
        term589835 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term589835, term589835.getClass(), "numerator", -2147483648);
        setIntField(term589835, term589835.getClass(), "denominator", -2091019227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term589835;
        try {
            callMethod(klass, "add", argTypes, term589745, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


