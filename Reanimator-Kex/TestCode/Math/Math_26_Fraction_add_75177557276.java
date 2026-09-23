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

public class Fraction_add_75177557276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13817;
     Object term13907;

    public Fraction_add_75177557276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13817 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term13817, term13817.getClass(), "numerator", 134217728);
        setIntField(term13817, term13817.getClass(), "denominator", -1874835454);
        term13907 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term13907, term13907.getClass(), "numerator", -2147483648);
        setIntField(term13907, term13907.getClass(), "denominator", -1344282663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term13907;
        try {
            callMethod(klass, "add", argTypes, term13817, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


