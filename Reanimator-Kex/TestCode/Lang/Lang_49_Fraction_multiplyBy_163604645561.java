package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_163604645561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term960;
     Object term987;

    public Fraction_multiplyBy_163604645561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term960 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term960, term960.getClass(), "numerator", 1063420942);
        setIntField(term960, term960.getClass(), "denominator", 1375330971);
        setField(term960, term960.getClass(), "toString", "aKnKipADSo");
        setField(term960, term960.getClass(), "toProperString", "wSQxaModmm");
        term987 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term987, term987.getClass(), "numerator", 972867650);
        setIntField(term987, term987.getClass(), "denominator", 1655935355);
        setField(term987, term987.getClass(), "toString", "UlajhuVLaP");
        setField(term987, term987.getClass(), "toProperString", "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term987;
        try {
            callMethod(klass, "multiplyBy", argTypes, term960, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


