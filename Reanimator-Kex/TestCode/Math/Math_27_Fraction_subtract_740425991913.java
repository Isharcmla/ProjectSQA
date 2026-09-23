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

public class Fraction_subtract_740425991913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383207;
     Object term383297;

    public Fraction_subtract_740425991913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383207 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term383207, term383207.getClass(), "numerator", 65536);
        setIntField(term383207, term383207.getClass(), "denominator", 1);
        term383297 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term383297, term383297.getClass(), "numerator", 134217728);
        setIntField(term383297, term383297.getClass(), "denominator", -1174404980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term383297;
        try {
            callMethod(klass, "subtract", argTypes, term383207, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


