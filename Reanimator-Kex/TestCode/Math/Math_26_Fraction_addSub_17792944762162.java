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

public class Fraction_addSub_17792944762162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075982;
     Object term1076072;

    public Fraction_addSub_17792944762162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1075982 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1075982, term1075982.getClass(), "numerator", 64);
        setIntField(term1075982, term1075982.getClass(), "denominator", -1508933311);
        term1076072 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1076072, term1076072.getClass(), "numerator", 64);
        setIntField(term1076072, term1076072.getClass(), "denominator", -639624191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1076072;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term1075982, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


