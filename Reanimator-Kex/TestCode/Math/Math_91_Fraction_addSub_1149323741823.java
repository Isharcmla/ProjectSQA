package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_addSub_1149323741823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308723;
     Object term308811;

    public Fraction_addSub_1149323741823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308723 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term308723, term308723.getClass(), "numerator", 1073741824);
        setIntField(term308723, term308723.getClass(), "denominator", 1);
        term308811 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term308811, term308811.getClass(), "numerator", 1073741824);
        setIntField(term308811, term308811.getClass(), "denominator", -2126252540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term308811;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term308723, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


