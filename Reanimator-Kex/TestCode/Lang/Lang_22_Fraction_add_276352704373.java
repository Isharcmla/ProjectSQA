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

public class Fraction_add_276352704373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107126;
     Object term107208;

    public Fraction_add_276352704373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107126 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term107126, term107126.getClass(), "numerator", 1048576);
        setIntField(term107126, term107126.getClass(), "denominator", 1073741825);
        term107208 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term107208, term107208.getClass(), "numerator", 134217728);
        setIntField(term107208, term107208.getClass(), "denominator", -65536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term107208;
        try {
            callMethod(klass, "add", argTypes, term107126, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


