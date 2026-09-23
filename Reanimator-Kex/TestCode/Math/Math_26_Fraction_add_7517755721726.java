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

public class Fraction_add_7517755721726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864553;
     Object term864643;

    public Fraction_add_7517755721726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term864553 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term864553, term864553.getClass(), "numerator", 1024);
        setIntField(term864553, term864553.getClass(), "denominator", -1156418494);
        term864643 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term864643, term864643.getClass(), "numerator", 536870912);
        setIntField(term864643, term864643.getClass(), "denominator", -1738589735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term864643;
        try {
            callMethod(klass, "add", argTypes, term864553, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


