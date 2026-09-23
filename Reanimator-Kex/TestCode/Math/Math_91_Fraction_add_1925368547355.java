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

public class Fraction_add_1925368547355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121568;
     Object term121656;

    public Fraction_add_1925368547355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121568 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term121568, term121568.getClass(), "numerator", 536870912);
        setIntField(term121568, term121568.getClass(), "denominator", -264162293);
        term121656 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term121656, term121656.getClass(), "numerator", -2147483648);
        setIntField(term121656, term121656.getClass(), "denominator", 1881217039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term121656;
        try {
            callMethod(klass, "add", argTypes, term121568, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


