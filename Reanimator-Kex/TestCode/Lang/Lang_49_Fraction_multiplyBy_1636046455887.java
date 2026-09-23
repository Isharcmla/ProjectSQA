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

public class Fraction_multiplyBy_1636046455887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251780;
     Object term251860;

    public Fraction_multiplyBy_1636046455887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251780 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term251780, term251780.getClass(), "numerator", 33100802);
        setIntField(term251780, term251780.getClass(), "denominator", 1610612715);
        term251860 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term251860, term251860.getClass(), "numerator", 1073741826);
        setIntField(term251860, term251860.getClass(), "denominator", 1803700701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term251860;
        try {
            callMethod(klass, "multiplyBy", argTypes, term251780, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


