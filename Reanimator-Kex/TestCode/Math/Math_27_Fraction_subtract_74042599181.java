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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_subtract_74042599181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15504;
     Object term15580;
     Object term15581;
     Object term15577;

    public Fraction_subtract_74042599181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15504 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term15504, term15504.getClass(), "numerator", -2147483648);
        setIntField(term15504, term15504.getClass(), "denominator", 1);
        term15580 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term15580, term15580.getClass(), "denominator", 1);
        setIntField(term15580, term15580.getClass(), "numerator", -2147483648);
        term15581 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term15581, term15581.getClass(), "denominator", 1);
        setIntField(term15581, term15581.getClass(), "numerator", -2147483648);
        term15577 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term15577, term15577.getClass(), "denominator", 1);
        setIntField(term15577, term15577.getClass(), "numerator", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term15504;
        Object retValue = callMethod(klass, "subtract", argTypes, term15504, args);
        assertTrue(recursiveEquals(term15504, term15580));
        assertTrue(recursiveEquals(term15504, term15581));
        assertTrue(recursiveEquals(retValue, term15577));
    }

};


