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

public class Fraction_multiplyBy_457422138987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316079;
     Object term316161;

    public Fraction_multiplyBy_457422138987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316079 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term316079, term316079.getClass(), "numerator", 1325400064);
        term316161 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term316161, term316161.getClass(), "numerator", 201326592);
        setIntField(term316161, term316161.getClass(), "denominator", 262144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term316161;
        try {
            callMethod(klass, "multiplyBy", argTypes, term316079, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


