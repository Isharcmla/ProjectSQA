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

public class Fraction_add_751775572911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444973;
     Object term445063;

    public Fraction_add_751775572911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term444973 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term444973, term444973.getClass(), "numerator", 2097152);
        setIntField(term444973, term444973.getClass(), "denominator", -467794814);
        term445063 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term445063, term445063.getClass(), "numerator", 67108864);
        setIntField(term445063, term445063.getClass(), "denominator", -1214069287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term445063;
        try {
            callMethod(klass, "add", argTypes, term444973, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


