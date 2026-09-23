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

public class Fraction_add_7517755721774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891697;
     Object term891787;

    public Fraction_add_7517755721774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term891697 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term891697, term891697.getClass(), "numerator", -2147483648);
        setIntField(term891697, term891697.getClass(), "denominator", -2080307070);
        term891787 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term891787, term891787.getClass(), "numerator", 32768);
        setIntField(term891787, term891787.getClass(), "denominator", -2143244599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term891787;
        try {
            callMethod(klass, "add", argTypes, term891697, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


