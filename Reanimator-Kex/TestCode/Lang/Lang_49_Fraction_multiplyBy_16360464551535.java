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

public class Fraction_multiplyBy_16360464551535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451547;
     Object term451627;

    public Fraction_multiplyBy_16360464551535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451547 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term451547, term451547.getClass(), "numerator", 570679546);
        term451627 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term451627, term451627.getClass(), "numerator", 524474);
        setIntField(term451627, term451627.getClass(), "denominator", 1556885937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term451627;
        try {
            callMethod(klass, "multiplyBy", argTypes, term451547, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


