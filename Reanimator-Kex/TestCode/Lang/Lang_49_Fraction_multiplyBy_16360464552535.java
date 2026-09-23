package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_16360464552535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term756169;
     Object term756249;

    public Fraction_multiplyBy_16360464552535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term756169 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term756169, term756169.getClass(), "numerator", 1912322);
        setIntField(term756169, term756169.getClass(), "denominator", 1073741824);
        term756249 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term756249, term756249.getClass(), "numerator", 2097152);
        setIntField(term756249, term756249.getClass(), "denominator", 70209973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term756249;
        try {
            callMethod(klass, "multiplyBy", argTypes, term756169, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


