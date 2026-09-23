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

public class Fraction_add_276352704205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51138;
     Object term51220;

    public Fraction_add_276352704205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51138 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term51138, term51138.getClass(), "numerator", 262144);
        setIntField(term51138, term51138.getClass(), "denominator", 140730900);
        term51220 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term51220, term51220.getClass(), "numerator", 32768);
        setIntField(term51220, term51220.getClass(), "denominator", -145950502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term51220;
        try {
            callMethod(klass, "add", argTypes, term51138, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


