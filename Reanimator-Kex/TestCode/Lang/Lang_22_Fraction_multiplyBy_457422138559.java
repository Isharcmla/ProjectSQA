package org.apache.commons.lang3.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_457422138559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172126;
     Object term172208;

    public Fraction_multiplyBy_457422138559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172126 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term172126, term172126.getClass(), "numerator", 906112522);
        term172208 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term172208, term172208.getClass(), "numerator", 906112522);
        setIntField(term172208, term172208.getClass(), "denominator", 1291644977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term172208;
        try {
            callMethod(klass, "multiplyBy", argTypes, term172126, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


