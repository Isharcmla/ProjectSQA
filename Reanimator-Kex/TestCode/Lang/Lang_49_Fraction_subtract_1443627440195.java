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

public class Fraction_subtract_1443627440195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46116;
     Object term46196;

    public Fraction_subtract_1443627440195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46116 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term46116, term46116.getClass(), "numerator", 65536);
        setIntField(term46116, term46116.getClass(), "denominator", -536871048);
        term46196 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term46196, term46196.getClass(), "numerator", -2147483648);
        setIntField(term46196, term46196.getClass(), "denominator", 276823452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term46196;
        try {
            callMethod(klass, "subtract", argTypes, term46116, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


