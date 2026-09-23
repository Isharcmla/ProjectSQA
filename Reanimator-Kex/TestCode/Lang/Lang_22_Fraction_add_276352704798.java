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

public class Fraction_add_276352704798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251957;
     Object term252039;

    public Fraction_add_276352704798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251957 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term251957, term251957.getClass(), "numerator", 4194304);
        setIntField(term251957, term251957.getClass(), "denominator", 335457564);
        term252039 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term252039, term252039.getClass(), "numerator", 256);
        setIntField(term252039, term252039.getClass(), "denominator", -432210306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term252039;
        try {
            callMethod(klass, "add", argTypes, term251957, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


