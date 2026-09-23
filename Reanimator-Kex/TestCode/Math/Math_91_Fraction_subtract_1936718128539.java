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

public class Fraction_subtract_1936718128539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201206;
     Object term201294;

    public Fraction_subtract_1936718128539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201206 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term201206, term201206.getClass(), "numerator", 1073741824);
        setIntField(term201206, term201206.getClass(), "denominator", -2147483647);
        term201294 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term201294, term201294.getClass(), "numerator", 1073741824);
        setIntField(term201294, term201294.getClass(), "denominator", -1662078994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term201294;
        try {
            callMethod(klass, "subtract", argTypes, term201206, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


