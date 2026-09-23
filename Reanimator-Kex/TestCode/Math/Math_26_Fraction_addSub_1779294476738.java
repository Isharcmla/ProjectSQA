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

public class Fraction_addSub_1779294476738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349163;
     Object term349253;

    public Fraction_addSub_1779294476738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349163 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term349163, term349163.getClass(), "numerator", 262144);
        setIntField(term349163, term349163.getClass(), "denominator", -1057102079);
        term349253 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term349253, term349253.getClass(), "numerator", 262144);
        setIntField(term349253, term349253.getClass(), "denominator", -821946175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term349253;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term349163, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


