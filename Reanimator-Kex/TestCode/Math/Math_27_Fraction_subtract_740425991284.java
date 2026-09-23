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

public class Fraction_subtract_740425991284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112664;
     Object term112754;

    public Fraction_subtract_740425991284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112664 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term112664, term112664.getClass(), "numerator", 134217728);
        setIntField(term112664, term112664.getClass(), "denominator", 1);
        term112754 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term112754, term112754.getClass(), "numerator", 1073741824);
        setIntField(term112754, term112754.getClass(), "denominator", -67108876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term112754;
        try {
            callMethod(klass, "subtract", argTypes, term112664, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


