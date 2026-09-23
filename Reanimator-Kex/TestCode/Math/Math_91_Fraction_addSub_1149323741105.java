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

public class Fraction_addSub_1149323741105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25340;
     Object term25428;

    public Fraction_addSub_1149323741105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25340 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term25340, term25340.getClass(), "numerator", 1073741824);
        setIntField(term25340, term25340.getClass(), "denominator", 1);
        term25428 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term25428, term25428.getClass(), "numerator", 8388608);
        setIntField(term25428, term25428.getClass(), "denominator", -2147483644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term25428;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term25340, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


