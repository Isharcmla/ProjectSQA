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

public class Fraction_add_7517755721852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term928412;
     Object term928502;

    public Fraction_add_7517755721852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term928412 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term928412, term928412.getClass(), "numerator", -2147483648);
        setIntField(term928412, term928412.getClass(), "denominator", -2147051502);
        term928502 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term928502, term928502.getClass(), "numerator", 8388608);
        setIntField(term928502, term928502.getClass(), "denominator", -1174743119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term928502;
        try {
            callMethod(klass, "add", argTypes, term928412, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


