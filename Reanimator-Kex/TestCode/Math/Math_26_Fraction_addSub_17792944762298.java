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

public class Fraction_addSub_17792944762298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1139787;
     Object term1139877;

    public Fraction_addSub_17792944762298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1139787 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1139787, term1139787.getClass(), "numerator", 8);
        setIntField(term1139787, term1139787.getClass(), "denominator", -486548415);
        term1139877 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1139877, term1139877.getClass(), "numerator", 8);
        setIntField(term1139877, term1139877.getClass(), "denominator", -284661119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1139877;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term1139787, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


