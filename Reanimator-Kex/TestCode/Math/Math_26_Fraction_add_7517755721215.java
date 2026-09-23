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

public class Fraction_add_7517755721215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604971;
     Object term605061;

    public Fraction_add_7517755721215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604971 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term604971, term604971.getClass(), "numerator", 1073741824);
        setIntField(term604971, term604971.getClass(), "denominator", -918387710);
        term605061 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term605061, term605061.getClass(), "numerator", 67108864);
        setIntField(term605061, term605061.getClass(), "denominator", -615006471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term605061;
        try {
            callMethod(klass, "add", argTypes, term604971, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


