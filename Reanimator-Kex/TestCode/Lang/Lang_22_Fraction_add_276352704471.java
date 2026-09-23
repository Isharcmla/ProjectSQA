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

public class Fraction_add_276352704471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141945;
     Object term142027;

    public Fraction_add_276352704471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141945 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term141945, term141945.getClass(), "numerator", 1073741824);
        setIntField(term141945, term141945.getClass(), "denominator", 192508380);
        term142027 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term142027, term142027.getClass(), "numerator", 131072);
        setIntField(term142027, term142027.getClass(), "denominator", -288074402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term142027;
        try {
            callMethod(klass, "add", argTypes, term141945, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


