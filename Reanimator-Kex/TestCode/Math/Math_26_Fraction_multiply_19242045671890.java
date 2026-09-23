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

public class Fraction_multiply_19242045671890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term946102;
     Object term946192;

    public Fraction_multiply_19242045671890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term946102 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term946102, term946102.getClass(), "numerator", -1056964606);
        term946192 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term946192, term946192.getClass(), "numerator", -1056964606);
        setIntField(term946192, term946192.getClass(), "denominator", 1750894619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term946192;
        try {
            callMethod(klass, "multiply", argTypes, term946102, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


