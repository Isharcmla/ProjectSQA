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

public class Fraction_add_7517755722310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1147102;
     Object term1147192;

    public Fraction_add_7517755722310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1147102 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1147102, term1147102.getClass(), "numerator", -2147483648);
        setIntField(term1147102, term1147102.getClass(), "denominator", -2063594670);
        term1147192 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1147192, term1147192.getClass(), "numerator", -2147483648);
        setIntField(term1147192, term1147192.getClass(), "denominator", -1713537519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1147192;
        try {
            callMethod(klass, "add", argTypes, term1147102, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


