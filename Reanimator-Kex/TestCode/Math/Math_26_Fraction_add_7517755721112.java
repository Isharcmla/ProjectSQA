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

public class Fraction_add_7517755721112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545603;
     Object term545693;

    public Fraction_add_7517755721112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545603 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term545603, term545603.getClass(), "numerator", -2147483648);
        setIntField(term545603, term545603.getClass(), "denominator", -197132286);
        term545693 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term545693, term545693.getClass(), "numerator", -2147483648);
        setIntField(term545693, term545693.getClass(), "denominator", -99094551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term545693;
        try {
            callMethod(klass, "add", argTypes, term545603, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


