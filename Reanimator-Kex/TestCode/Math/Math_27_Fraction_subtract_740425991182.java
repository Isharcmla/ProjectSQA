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

public class Fraction_subtract_740425991182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61059;
     Object term61149;

    public Fraction_subtract_740425991182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61059 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term61059, term61059.getClass(), "numerator", 134217728);
        setIntField(term61059, term61059.getClass(), "denominator", 1);
        term61149 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term61149, term61149.getClass(), "numerator", -2147483648);
        setIntField(term61149, term61149.getClass(), "denominator", -536870908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term61149;
        try {
            callMethod(klass, "subtract", argTypes, term61059, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


