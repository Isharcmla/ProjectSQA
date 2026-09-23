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

public class Fraction_addSub_17792944761337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665728;
     Object term665818;

    public Fraction_addSub_17792944761337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665728 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term665728, term665728.getClass(), "numerator", 1024);
        setIntField(term665728, term665728.getClass(), "denominator", -1343229887);
        term665818 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term665818, term665818.getClass(), "numerator", 1024);
        setIntField(term665818, term665818.getClass(), "denominator", -1341128575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term665818;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term665728, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


