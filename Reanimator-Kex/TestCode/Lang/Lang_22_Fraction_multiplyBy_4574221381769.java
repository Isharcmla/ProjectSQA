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

public class Fraction_multiplyBy_4574221381769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575093;
     Object term575175;

    public Fraction_multiplyBy_4574221381769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term575093 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term575093, term575093.getClass(), "numerator", 804500362);
        term575175 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term575175, term575175.getClass(), "numerator", 50533250);
        setIntField(term575175, term575175.getClass(), "denominator", 1074594305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term575175;
        try {
            callMethod(klass, "multiplyBy", argTypes, term575093, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


