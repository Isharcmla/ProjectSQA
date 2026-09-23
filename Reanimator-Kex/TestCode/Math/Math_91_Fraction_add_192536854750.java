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

public class Fraction_add_192536854750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5780;
     Object term5868;

    public Fraction_add_192536854750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5780 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term5780, term5780.getClass(), "numerator", -2147483648);
        setIntField(term5780, term5780.getClass(), "denominator", -349979391);
        term5868 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term5868, term5868.getClass(), "numerator", -2147483648);
        setIntField(term5868, term5868.getClass(), "denominator", 2113044397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term5868;
        try {
            callMethod(klass, "add", argTypes, term5780, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


