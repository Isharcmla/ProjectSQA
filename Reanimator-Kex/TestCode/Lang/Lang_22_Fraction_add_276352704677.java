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

public class Fraction_add_276352704677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213861;
     Object term213943;

    public Fraction_add_276352704677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213861 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term213861, term213861.getClass(), "numerator", 4);
        setIntField(term213861, term213861.getClass(), "denominator", 1525658380);
        term213943 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term213943, term213943.getClass(), "numerator", 8388608);
        setIntField(term213943, term213943.getClass(), "denominator", -1876981322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term213943;
        try {
            callMethod(klass, "add", argTypes, term213861, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


