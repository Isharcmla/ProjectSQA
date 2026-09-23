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

public class Fraction_add_276352704552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170001;
     Object term170083;

    public Fraction_add_276352704552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170001 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term170001, term170001.getClass(), "numerator", 8192);
        setIntField(term170001, term170001.getClass(), "denominator", 1431144492);
        term170083 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term170083, term170083.getClass(), "numerator", 8388608);
        setIntField(term170083, term170083.getClass(), "denominator", -1810572858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term170083;
        try {
            callMethod(klass, "add", argTypes, term170001, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


