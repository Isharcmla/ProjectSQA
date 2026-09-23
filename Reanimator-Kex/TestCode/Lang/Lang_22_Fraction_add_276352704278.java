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

public class Fraction_add_276352704278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75892;
     Object term75974;

    public Fraction_add_276352704278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75892 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term75892, term75892.getClass(), "numerator", 8192);
        setIntField(term75892, term75892.getClass(), "denominator", 46242004);
        term75974 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term75974, term75974.getClass(), "numerator", 16777216);
        setIntField(term75974, term75974.getClass(), "denominator", -39836998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term75974;
        try {
            callMethod(klass, "add", argTypes, term75892, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


