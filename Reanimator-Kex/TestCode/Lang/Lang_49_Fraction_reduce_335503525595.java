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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_335503525595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164365;
     Object term164882;
     Object term164879;

    public Fraction_reduce_335503525595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164365 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term164365, term164365.getClass(), "numerator", -382764542);
        setIntField(term164365, term164365.getClass(), "denominator", 1546922135);
        term164882 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term164882, term164882.getClass(), "numerator", -382764542);
        setIntField(term164882, term164882.getClass(), "denominator", 1546922135);
        setField(term164882, term164882.getClass(), "toString", null);
        setField(term164882, term164882.getClass(), "toProperString", null);
        term164879 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term164879, term164879.getClass(), "numerator", -382764542);
        setIntField(term164879, term164879.getClass(), "denominator", 1546922135);
        setField(term164879, term164879.getClass(), "toString", null);
        setField(term164879, term164879.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term164365, args);
        assertTrue(recursiveEquals(term164365, term164882));
        assertTrue(recursiveEquals(retValue, term164879));
    }

};


