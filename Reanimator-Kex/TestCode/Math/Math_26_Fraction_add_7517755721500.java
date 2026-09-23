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

public class Fraction_add_7517755721500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750005;
     Object term750095;

    public Fraction_add_7517755721500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term750005 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term750005, term750005.getClass(), "numerator", 536870912);
        setIntField(term750005, term750005.getClass(), "denominator", -2126642862);
        term750095 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term750095, term750095.getClass(), "numerator", 1073741824);
        setIntField(term750095, term750095.getClass(), "denominator", -1658637551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term750095;
        try {
            callMethod(klass, "add", argTypes, term750005, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


