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

public class Fraction_reduce_3355035252430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722314;
     Object term723102;
     Object term723099;

    public Fraction_reduce_3355035252430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term722314 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term722314, term722314.getClass(), "numerator", 1570464818);
        setIntField(term722314, term722314.getClass(), "denominator", 1327779969);
        term723102 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term723102, term723102.getClass(), "numerator", 1570464818);
        setIntField(term723102, term723102.getClass(), "denominator", 1327779969);
        setField(term723102, term723102.getClass(), "toString", null);
        setField(term723102, term723102.getClass(), "toProperString", null);
        term723099 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term723099, term723099.getClass(), "numerator", 1570464818);
        setIntField(term723099, term723099.getClass(), "denominator", 1327779969);
        setField(term723099, term723099.getClass(), "toString", null);
        setField(term723099, term723099.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term722314, args);
        assertTrue(recursiveEquals(term722314, term723102));
        assertTrue(recursiveEquals(retValue, term723099));
    }

};


