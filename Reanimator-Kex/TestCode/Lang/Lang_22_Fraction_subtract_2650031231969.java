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

public class Fraction_subtract_2650031231969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642163;
     Object term642245;

    public Fraction_subtract_2650031231969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term642163 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term642163, term642163.getClass(), "numerator", 1);
        setIntField(term642163, term642163.getClass(), "denominator", -1964789688);
        term642245 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term642245, term642245.getClass(), "numerator", 262144);
        setIntField(term642245, term642245.getClass(), "denominator", 1209020484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term642245;
        try {
            callMethod(klass, "subtract", argTypes, term642163, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


