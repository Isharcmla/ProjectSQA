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

public class Fraction_longValue_186354357846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;
     Object term1847;

    public Fraction_longValue_186354357846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term58, term58.getClass(), "denominator", 865208305);
        setIntField(term58, term58.getClass(), "numerator", -1275173084);
        term1847 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1847, term1847.getClass(), "denominator", 865208305);
        setIntField(term1847, term1847.getClass(), "numerator", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "longValue", argTypes, term58, args);
        assertTrue(recursiveEquals(term58, term1847));
        assertTrue(recursiveEquals(retValue, -1L));
    }

};


