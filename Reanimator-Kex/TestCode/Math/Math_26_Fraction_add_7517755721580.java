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

public class Fraction_add_7517755721580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791692;
     Object term791782;

    public Fraction_add_7517755721580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term791692 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term791692, term791692.getClass(), "numerator", 16384);
        setIntField(term791692, term791692.getClass(), "denominator", -536284654);
        term791782 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term791782, term791782.getClass(), "numerator", 268435456);
        setIntField(term791782, term791782.getClass(), "denominator", -1875154767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term791782;
        try {
            callMethod(klass, "add", argTypes, term791692, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


