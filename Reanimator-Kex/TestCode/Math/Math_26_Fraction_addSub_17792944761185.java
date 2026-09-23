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

public class Fraction_addSub_17792944761185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586702;
     Object term586792;

    public Fraction_addSub_17792944761185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term586702 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term586702, term586702.getClass(), "numerator", -1610612736);
        setIntField(term586702, term586702.getClass(), "denominator", -1072043967);
        term586792 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term586792, term586792.getClass(), "numerator", 1610612736);
        setIntField(term586792, term586792.getClass(), "denominator", -1070796671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term586792;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term586702, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


