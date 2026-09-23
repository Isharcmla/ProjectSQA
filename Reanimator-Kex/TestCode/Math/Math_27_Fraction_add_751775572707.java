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

public class Fraction_add_751775572707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290934;
     Object term291024;

    public Fraction_add_751775572707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290934 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term290934, term290934.getClass(), "numerator", 4);
        setIntField(term290934, term290934.getClass(), "denominator", -1878720510);
        term291024 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term291024, term291024.getClass(), "numerator", 1);
        setIntField(term291024, term291024.getClass(), "denominator", -1095878935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term291024;
        try {
            callMethod(klass, "add", argTypes, term290934, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


