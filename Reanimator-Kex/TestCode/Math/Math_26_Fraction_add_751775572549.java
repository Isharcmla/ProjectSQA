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

public class Fraction_add_751775572549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252748;
     Object term252838;

    public Fraction_add_751775572549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252748 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term252748, term252748.getClass(), "numerator", 67108864);
        setIntField(term252748, term252748.getClass(), "denominator", -798482302);
        term252838 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term252838, term252838.getClass(), "numerator", 32768);
        setIntField(term252838, term252838.getClass(), "denominator", -1695392295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term252838;
        try {
            callMethod(klass, "add", argTypes, term252748, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


