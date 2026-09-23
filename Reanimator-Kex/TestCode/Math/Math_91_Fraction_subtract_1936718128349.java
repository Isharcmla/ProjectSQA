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

public class Fraction_subtract_1936718128349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119101;
     Object term119189;

    public Fraction_subtract_1936718128349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119101 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term119101, term119101.getClass(), "numerator", 4096);
        setIntField(term119101, term119101.getClass(), "denominator", -2147483647);
        term119189 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term119189, term119189.getClass(), "numerator", 67108864);
        setIntField(term119189, term119189.getClass(), "denominator", -1923804366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term119189;
        try {
            callMethod(klass, "subtract", argTypes, term119101, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


