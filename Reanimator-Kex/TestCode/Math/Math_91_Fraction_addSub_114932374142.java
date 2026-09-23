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
import java.lang.Boolean;

public class Fraction_addSub_114932374142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term80;
     Object term83;

    public Fraction_addSub_114932374142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term77, term77.getClass(), "denominator", 1962444399);
        setIntField(term77, term77.getClass(), "numerator", 767834723);
        term80 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term80, term80.getClass(), "denominator", -602026508);
        setIntField(term80, term80.getClass(), "numerator", -157887805);
        term83 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term80;
        args[1] = term83;
        try {
            callMethod(klass, "addSub", argTypes, term77, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


