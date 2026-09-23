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

public class Fraction_add_2763527041350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440743;
     Object term440825;

    public Fraction_add_2763527041350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term440743 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term440743, term440743.getClass(), "numerator", 16384);
        setIntField(term440743, term440743.getClass(), "denominator", 596059164);
        term440825 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term440825, term440825.getClass(), "numerator", -2147483648);
        setIntField(term440825, term440825.getClass(), "denominator", -505686786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term440825;
        try {
            callMethod(klass, "add", argTypes, term440743, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


