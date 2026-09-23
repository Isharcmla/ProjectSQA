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

public class Fraction_add_7517755721561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782683;
     Object term782773;

    public Fraction_add_7517755721561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term782683 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term782683, term782683.getClass(), "numerator", 1024);
        setIntField(term782683, term782683.getClass(), "denominator", -1966078174);
        term782773 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term782773, term782773.getClass(), "numerator", -2147483648);
        setIntField(term782773, term782773.getClass(), "denominator", -1206138823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term782773;
        try {
            callMethod(klass, "add", argTypes, term782683, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


