package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_1936718128460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168042;
     Object term168130;

    public Fraction_subtract_1936718128460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168042 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term168042, term168042.getClass(), "numerator", 1073741824);
        setIntField(term168042, term168042.getClass(), "denominator", -2147483647);
        term168130 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term168130, term168130.getClass(), "numerator", 4096);
        setIntField(term168130, term168130.getClass(), "denominator", -365196410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term168130;
        try {
            callMethod(klass, "subtract", argTypes, term168042, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


