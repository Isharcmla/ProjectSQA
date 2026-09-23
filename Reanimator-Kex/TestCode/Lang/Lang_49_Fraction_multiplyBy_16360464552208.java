package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_16360464552208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term651958;
     Object term652038;

    public Fraction_multiplyBy_16360464552208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term651958 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term651958, term651958.getClass(), "numerator", 262758894);
        setIntField(term651958, term651958.getClass(), "denominator", -1);
        term652038 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term652038, term652038.getClass(), "numerator", 268440577);
        setIntField(term652038, term652038.getClass(), "denominator", 543903491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term652038;
        try {
            callMethod(klass, "multiplyBy", argTypes, term651958, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


