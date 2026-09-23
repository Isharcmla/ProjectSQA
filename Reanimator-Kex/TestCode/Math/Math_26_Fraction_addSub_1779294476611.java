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

public class Fraction_addSub_1779294476611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281300;
     Object term281390;

    public Fraction_addSub_1779294476611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281300 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term281300, term281300.getClass(), "numerator", -2147483648);
        setIntField(term281300, term281300.getClass(), "denominator", -1928181695);
        term281390 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term281390, term281390.getClass(), "numerator", 536870912);
        setIntField(term281390, term281390.getClass(), "denominator", -1928181631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term281390;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term281300, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


