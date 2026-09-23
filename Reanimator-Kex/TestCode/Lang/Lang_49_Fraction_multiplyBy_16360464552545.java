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

public class Fraction_multiplyBy_16360464552545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759461;
     Object term759541;
     Object term759904;
     Object term759905;
     Object term759895;

    public Fraction_multiplyBy_16360464552545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term759461 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term759461, term759461.getClass(), "numerator", 746586114);
        setIntField(term759461, term759461.getClass(), "denominator", -2013265920);
        term759541 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term759541, term759541.getClass(), "numerator", 4);
        setIntField(term759541, term759541.getClass(), "denominator", 1715470341);
        term759904 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term759904, term759904.getClass(), "numerator", 746586114);
        setIntField(term759904, term759904.getClass(), "denominator", -2013265920);
        setField(term759904, term759904.getClass(), "toString", null);
        setField(term759904, term759904.getClass(), "toProperString", null);
        term759905 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term759905, term759905.getClass(), "numerator", 4);
        setIntField(term759905, term759905.getClass(), "denominator", 1715470341);
        setField(term759905, term759905.getClass(), "toString", null);
        setField(term759905, term759905.getClass(), "toProperString", null);
        term759895 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term759895, term759895.getClass(), "numerator", -124431019);
        setIntField(term759895, term759895.getClass(), "denominator", 419430400);
        setField(term759895, term759895.getClass(), "toString", null);
        setField(term759895, term759895.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term759541;
        Object retValue = callMethod(klass, "multiplyBy", argTypes, term759461, args);
        assertTrue(recursiveEquals(term759461, term759904));
        assertTrue(recursiveEquals(term759541, term759905));
        assertTrue(recursiveEquals(retValue, term759895));
    }

};


