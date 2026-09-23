package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_addSub_1779294476349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150945;
     Object term151035;

    public Fraction_addSub_1779294476349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150945 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term150945, term150945.getClass(), "numerator", 4194304);
        setIntField(term150945, term150945.getClass(), "denominator", -2007236159);
        term151035 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term151035, term151035.getClass(), "numerator", 4194304);
        setIntField(term151035, term151035.getClass(), "denominator", -1826815231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term151035;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term150945, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


