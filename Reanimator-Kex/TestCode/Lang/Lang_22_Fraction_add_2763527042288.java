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

public class Fraction_add_2763527042288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747326;
     Object term747408;

    public Fraction_add_2763527042288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747326 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term747326, term747326.getClass(), "numerator", 8388608);
        setIntField(term747326, term747326.getClass(), "denominator", 268810884);
        term747408 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term747408, term747408.getClass(), "numerator", 536870912);
        setIntField(term747408, term747408.getClass(), "denominator", -402973998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term747408;
        try {
            callMethod(klass, "add", argTypes, term747326, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


