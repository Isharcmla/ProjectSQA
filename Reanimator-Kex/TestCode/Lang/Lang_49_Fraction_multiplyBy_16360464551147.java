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

public class Fraction_multiplyBy_16360464551147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332706;
     Object term332786;

    public Fraction_multiplyBy_16360464551147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332706 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term332706, term332706.getClass(), "numerator", 657597902);
        setIntField(term332706, term332706.getClass(), "denominator", 671630349);
        term332786 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term332786, term332786.getClass(), "numerator", 805853198);
        setIntField(term332786, term332786.getClass(), "denominator", 1943570963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term332786;
        try {
            callMethod(klass, "multiplyBy", argTypes, term332706, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


