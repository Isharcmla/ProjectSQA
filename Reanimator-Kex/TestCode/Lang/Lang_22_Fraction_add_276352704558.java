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

public class Fraction_add_276352704558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171545;
     Object term171627;

    public Fraction_add_276352704558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171545 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term171545, term171545.getClass(), "numerator", -2147483648);
        setIntField(term171545, term171545.getClass(), "denominator", 1140871652);
        term171627 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term171627, term171627.getClass(), "numerator", 8);
        setIntField(term171627, term171627.getClass(), "denominator", -1644181758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term171627;
        try {
            callMethod(klass, "add", argTypes, term171545, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


