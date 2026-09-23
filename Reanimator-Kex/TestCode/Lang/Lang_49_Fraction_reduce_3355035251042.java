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

public class Fraction_reduce_3355035251042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299881;
     Object term300374;
     Object term300371;

    public Fraction_reduce_3355035251042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299881 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term299881, term299881.getClass(), "numerator", 1342176978);
        setIntField(term299881, term299881.getClass(), "denominator", 1879048193);
        term300374 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term300374, term300374.getClass(), "numerator", 1342176978);
        setIntField(term300374, term300374.getClass(), "denominator", 1879048193);
        setField(term300374, term300374.getClass(), "toString", null);
        setField(term300374, term300374.getClass(), "toProperString", null);
        term300371 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term300371, term300371.getClass(), "numerator", 1342176978);
        setIntField(term300371, term300371.getClass(), "denominator", 1879048193);
        setField(term300371, term300371.getClass(), "toString", null);
        setField(term300371, term300371.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term299881, args);
        assertTrue(recursiveEquals(term299881, term300374));
        assertTrue(recursiveEquals(retValue, term300371));
    }

};


