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

public class Fraction_add_276352704409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118784;
     Object term118866;

    public Fraction_add_276352704409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118784 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term118784, term118784.getClass(), "numerator", 8);
        setIntField(term118784, term118784.getClass(), "denominator", 1342598084);
        term118866 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term118866, term118866.getClass(), "numerator", 4);
        setIntField(term118866, term118866.getClass(), "denominator", -1812268686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term118866;
        try {
            callMethod(klass, "add", argTypes, term118784, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


