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

public class Fraction_multiplyBy_16360464552149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634191;
     Object term634271;

    public Fraction_multiplyBy_16360464552149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term634191 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term634191, term634191.getClass(), "numerator", 1593830858);
        term634271 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term634271, term634271.getClass(), "numerator", 16777217);
        setIntField(term634271, term634271.getClass(), "denominator", 2130697585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term634271;
        try {
            callMethod(klass, "multiplyBy", argTypes, term634191, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


