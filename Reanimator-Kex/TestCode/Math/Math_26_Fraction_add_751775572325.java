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

public class Fraction_add_751775572325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138126;
     Object term138216;

    public Fraction_add_751775572325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138126 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term138126, term138126.getClass(), "numerator", -2147483648);
        setIntField(term138126, term138126.getClass(), "denominator", -1072627150);
        term138216 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term138216, term138216.getClass(), "numerator", -2147483648);
        setIntField(term138216, term138216.getClass(), "denominator", -570105471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term138216;
        try {
            callMethod(klass, "add", argTypes, term138126, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


